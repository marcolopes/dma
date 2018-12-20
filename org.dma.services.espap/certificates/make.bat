@echo off
echo *******************************************************************************
echo * Marco Lopes (marcolopespt@gmail.com)
echo * Importacao da chave publica para KEY STORE
echo *******************************************************************************
setlocal

set OPENSSL_CONF=
set OPENSSL_PATH=C:\openssl\bin
set PATH=%PATH%;%OPENSSL_PATH%
if exist %OPENSSL_PATH%\openssl.exe goto START
echo OpenSSL NOT FOUND in %OPENSSL_PATH%
goto END

REM =======
REM  START
REM =======
:START
openssl pkcs7 -in saphetydoc.p7b -inform DER -print_certs -outform PEM -out saphetydoc.pem
keytool -import -trustcacerts -alias root -file saphetydoc.pem -keystore saphetydoc.jks

:END
pause