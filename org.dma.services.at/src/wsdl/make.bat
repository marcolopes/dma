@echo off
echo *****************************************************************************
echo * Marco Lopes (marcolopespt@gmail.com)
echo * JAX-WS - Java API for XML Web Services
echo * https://javaee.github.io/metro-jax-ws/
echo * https://docs.oracle.com/javase/7/docs/technotes/tools/share/wsimport.html
echo *****************************************************************************

set JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8

wsimport Series.wsdl -verbose -Xnocompile -s ..
wsimport Factemiws.wsdl -verbose -Xnocompile -s ..
wsimport Fatcorews.wsdl -verbose -Xnocompile -s ..
wsimport DocumentosTransporte.wsdl -verbose -Xnocompile -s ..
wsimport eTaxFreeSoapWebServices.wsdl -verbose -Xnocompile -s ..

pause