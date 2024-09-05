@echo off
echo *******************************************************************************
echo * Marco Lopes (marcolopespt@gmail.com)
echo * Importacao da chave publica para KEY STORE
echo * Conversao do certificado de TESTES (compatibilidade)
echo * https://info.portaldasfinancas.gov.pt/pt/apoio_contribuinte/Faturacao/Paginas/default.aspx
echo *******************************************************************************
setlocal

set OPENSSL_CONF=
set OUTPUT_FOLDER=output
set OPENSSL_PATH=C:\openssl-3\x64\bin
set OPENSSL_MODULES=C:\openssl-3\x64\lib\ossl-modules
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

echo EXTRAI A CHAVE PUBLICA DO CERTIFICADO AT (formato:PEM, encoding:BASE64)
del %OUTPUT_FOLDER%\ChavePublicaAT.pem
openssl x509 -in ChaveCifraPublicaAT2025.cer -pubkey -noout > %OUTPUT_FOLDER%\ChavePublicaAT.pem

echo CONVERTE A CHAVE PUBLICA (formato:DER)
del %OUTPUT_FOLDER%\ChavePublicaAT.der
openssl enc -base64 -d -in %OUTPUT_FOLDER%\ChavePublicaAT.pem > %OUTPUT_FOLDER%\ChavePublicaAT.der

echo IMPORTA A CHAVE PUBLICA DO CERTIFICADO AT (formato:JKS, alias:sapubkey)
del %OUTPUT_FOLDER%\ChavePublicaAT.jks
keytool -importcert -noprompt -alias "sapubkey" -file ChaveCifraPublicaAT2025.cer -keystore %OUTPUT_FOLDER%\ChavePublicaAT.jks -storepass 123456

echo IMPORTA A TRUST STORE (formato:JKS, alias:portaldasfinancas)
del %OUTPUT_FOLDER%\TrustStoreAT.jks
keytool -importcert -noprompt -alias "portaldasfinancas" -file portaldasfinancas.gov.pt.pem -keystore %OUTPUT_FOLDER%\TrustStoreAT.jks -storepass 123456

echo CONVERTE O CERTIFICADO DE TESTES (compatibilidade com JAVA 7)
del %OUTPUT_FOLDER%\TesteWebservices.pfx
openssl pkcs12 -nodes -in TesteWebservices.pfx -out %OUTPUT_FOLDER%\TesteWebservices.pem -nodes -passin pass:TESTEwebservice
openssl pkcs12 -legacy -keypbe PBE-SHA1-3DES -certpbe PBE-SHA1-3DES -export -in %OUTPUT_FOLDER%\TesteWebservices.pem -out %OUTPUT_FOLDER%\TesteWebservices.pfx -passout pass:TESTEwebservice

:END
pause