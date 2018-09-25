@echo off
echo *******************************************************************************
echo * Marco Lopes (marcolopespt@gmail.com)
echo * http://jax-ws.java.net/nonav/2.2.1/docs/wsimport.html
echo *******************************************************************************

wsimport faturas.wsdl -verbose -Xnocompile -s src
wsimport documentosTransporte.wsdl -verbose -Xnocompile -s src
wsimport eTaxFreeSoapWebServices.wsdl -verbose -Xnocompile -s src

pause