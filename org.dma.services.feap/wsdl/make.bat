@echo off
echo *****************************************************************************
echo * Marco Lopes (marcolopespt@gmail.com)
echo * JAX-WS - Java API for XML Web Services
echo * https://javaee.github.io/metro-jax-ws/
echo * https://docs.oracle.com/javase/7/docs/technotes/tools/share/wsimport.html
echo *****************************************************************************

REM Necessario utilizar o parametro -extension para importar MessageService
REM [WARNING] Ignoring SOAP port "CustomBinding_IMessageService": it uses non-standard SOAP 1.2 binding
REM wsimport CTMessageService.wsdl -extension -verbose -Xnocompile -s ..\src

wsimport NetixMessaging-1.2.0.wsdl -verbose -Xnocompile -s ..\src
pause