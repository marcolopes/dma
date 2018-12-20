@echo off
echo *******************************************************************************
echo * Marco Lopes (marcolopespt@gmail.com)
echo * KEY STORE para importacao da chave publica AT
echo *******************************************************************************
setlocal

set OPENSSL_PATH=C:\openssl\bin
set OPENSSL_CONF=
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