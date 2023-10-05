@echo off
echo *******************************************************************************
echo * Marco Lopes (marcolopespt@gmail.com)
echo * Importacao da chave publica para KEY STORE
echo * https://info.portaldasfinancas.gov.pt/pt/apoio_contribuinte/Faturacao/Paginas/default.aspx
echo *******************************************************************************
setlocal

set OPENSSL_CONF=
set OUTPUT_FOLDER=output
set OPENSSL_PATH=C:\openssl\bin
set PATH=%PATH%;%OPENSSL_PATH%
if exist %OPENSSL_PATH%\openssl.exe goto START
echo OpenSSL NOT FOUND in %OPENSSL_PATH%
goto END

REM =======
REM  START
REM =======
:START
md %OUTPUT_FOLDER%>nul

echo SET CODEPAGE UTF-8
chcp 65001

echo RENAME CERTIFICATES
copy ChaveCifraPublicaAT2025.cer %OUTPUT_FOLDER%\ChavePublicaAT.cer
copy portaldasfinancas.gov.pt.pem %OUTPUT_FOLDER%\TrustStoreAT.cer

echo EXTRAI A CHAVE PUBLICA DO CERTIFICADO AT (formato:PEM, encoding:BASE64)
openssl x509 -in %OUTPUT_FOLDER%\ChavePublicaAT.cer -pubkey -noout > %OUTPUT_FOLDER%\ChavePublicaAT.pem

echo CONVERTE A CHAVE PUBLICA (formato:DER)
openssl enc -base64 -d -in %OUTPUT_FOLDER%\ChavePublicaAT.pem > %OUTPUT_FOLDER%\ChavePublicaAT.der

echo IMPORTA A CHAVE PUBLICA DO CERTIFICADO AT (formato:JKS, alias:sapubkey)
del %OUTPUT_FOLDER%\ChavePublicaAT.jks
keytool -importcert -noprompt -alias "sapubkey" -file %OUTPUT_FOLDER%\ChavePublicaAT.cer -keystore %OUTPUT_FOLDER%\ChavePublicaAT.jks -storepass 123456

echo IMPORTA A TRUST STORE (formato:JKS, alias:portaldasfinancas)
del %OUTPUT_FOLDER%\TrustStoreAT.jks
keytool -importcert -noprompt -alias "portaldasfinancas" -file %OUTPUT_FOLDER%\TrustStoreAT.cer -keystore %OUTPUT_FOLDER%\TrustStoreAT.jks -storepass 123456

:END
pause