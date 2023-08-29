@echo off
echo *****************************************************************************
echo * Marco Lopes (marcolopespt@gmail.com)
echo * JAX-WS - Java API for XML Web Services
echo * https://javaee.github.io/metro-jax-ws/
echo * https://docs.oracle.com/javase/7/docs/technotes/tools/share/wsimport.html
echo *****************************************************************************

wsimport IfmbWS.xml -B-XautoNameResolution -verbose -Xnocompile -s ..\src

REM https://stackoverflow.com/questions/2401661/clickatell-soap-wsdl-to-jaxb-java-classes
wsimport ifthenpaymbw.xml -catalog catalog.txt -extension -verbose -Xnocompile -s ..\src

pause