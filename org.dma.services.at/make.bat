@echo off
echo *******************************************************************************
echo * Marco Lopes (marcolopes@netc.pt)
echo * http://jax-ws.java.net/nonav/2.2.1/docs/wsimport.html
echo *******************************************************************************

wsimport faturas.wsdl -verbose -Xnocompile -s src
wsimport documentosTransporte.wsdl -verbose -Xnocompile -s src
pause