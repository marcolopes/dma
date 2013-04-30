@echo off
echo *******************************************************************************
echo * 2008-2013 Projecto Colibri
echo * Marco Lopes (marcolopes@projectocolibri.com)
echo * http://jax-ws.java.net/nonav/2.2.1/docs/wsimport.html
echo *******************************************************************************

wsimport faturas.wsdl -verbose -Xnocompile -s src
wsimport documentosTransporte.wsdl -verbose -Xnocompile -s src
pause