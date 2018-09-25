@echo off
echo *******************************************************************************
echo * Marco Lopes (marcolopespt@gmail.com)
echo * http://jax-ws.java.net/nonav/2.2.1/docs/wsimport.html
echo *******************************************************************************

wsimport http://ec.europa.eu/taxation_customs/vies/checkVatService.wsdl -verbose -Xnocompile -s src
pause