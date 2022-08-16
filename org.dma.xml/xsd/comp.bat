@echo off
echo *****************************************************************************
echo * 2008-2021 Public Domain
echo * Contributors
echo * Marco Lopes (marcolopespt@gmail.com)
echo * https://xmlbeans.apache.org/docs/2.0.0/guide/tools.html
echo *****************************************************************************
setlocal

set SCHEMA_FOLDER=.
if not "%2"=="" set SCHEMA_FOLDER=%2%
set OUTPUT_FOLDER=..\libraries
set CONFIG_XSD=%SCHEMA_FOLDER%\%1.xsdconfig
set OUTPUT_JAR=%OUTPUT_FOLDER%\%1.jar
set SOURCE_FOLDER=..\src
md %OUTPUT_FOLDER%

set SOURCE_XSD=%SCHEMA_FOLDER%\%1.xsd
if exist "%SOURCE_XSD%" goto JAVA
echo %1.xsd not found in %SCHEMA_FOLDER%!
set SOURCE_XSD=%SCHEMA_FOLDER%\%1.wsdl
if exist "%SOURCE_XSD%" goto JAVA

echo %1.wsdl not found in %SCHEMA_FOLDER%!
echo USAGE: COMP SCHEMA_FILE [SCHEMA_FOLDER]
goto END

:JAVA
echo JAVA: %JAVA_HOME%
if exist "%JAVA_HOME%\bin\javac.exe" goto XMLBEANS
echo JAVA SDK NOT FOUND! PLEASE configure JAVA_HOME
goto END

:XMLBEANS
set BEANS_HOME=..
set BEANS_LIB=%BEANS_HOME%\xmlbeans
set BEANS_CP=%BEANS_LIB%\xmlbeans-3.1.0.jar
if exist %BEANS_LIB% goto COMPILE
echo XMLBEANS LIB NOT FOUND @ %BEANS_LIB%
goto END

:COMPILE
set JAVA=%JAVA_HOME%\bin\java.exe
set JAVAC=%JAVA_HOME%\bin\javac.exe
echo COMPILING: %SOURCE_XSD%
if not exist %CONFIG_XSD% goto WITHOUT_CONFIG

"%JAVA%" -classpath %BEANS_CP% org.apache.xmlbeans.impl.tool.SchemaCompiler -src %SOURCE_FOLDER% -out %OUTPUT_JAR% %SOURCE_XSD% %CONFIG_XSD% -compiler "%JAVAC%" -javasource "1.5"
goto END

:WITHOUT_CONFIG
echo %CONFIG_XSD% NOT FOUND! Compiling without xsdconfig
"%JAVA%" -classpath %BEANS_CP% org.apache.xmlbeans.impl.tool.SchemaCompiler -src %SOURCE_FOLDER% -out %OUTPUT_JAR% %SOURCE_XSD% -compiler "%JAVAC%" -javasource "1.5"

:END
