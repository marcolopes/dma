@echo off
echo *******************************************************************************
echo * Marco Lopes (marcolopespt@gmail.com)
echo * JAX-WS - Java API for XML Web Services
echo * https://javaee.github.io/metro-jax-ws/
echo * https://docs.oracle.com/javase/7/docs/technotes/tools/share/wsimport.html
echo *******************************************************************************

wsimport https://ec.europa.eu/taxation_customs/vies/checkVatService.wsdl -verbose -Xnocompile -s ..\src
pause