SSl=standerd
TLS= bit advanced version of SSL,it adds more features

TrustStore: it is used to store public keys
where is it?


keyStore: it is used to store private keys
wher is it?


key tool: it is used to generate selfsigned certificate with based on provided algorithem (RSA)
where is it?


how to generate self signed certificate?
keytool -genkey -alias veeru-demo -storetype JKS -keyalg RSA -keysize 2048 -validity 1 -keystore veeru-demo.jks

Note:- during the setup it will ask to setup key password and key-store password

Example:-
veeru@veerus-MacBook-Pro root % keytoo -genkey -alias veeru-demo -storetype JKS -keyalg RSA -keysize 2048 -validity 1 -keystore veeru-demo.jks
zsh: command not found: keytoo
veeru@veerus-MacBook-Pro root % keytool -genkey -alias veeru-demo -storetype JKS -keyalg RSA -keysize 2048 -validity 1 -keystore veeru-demo.jks
Enter keystore password:
Keystore password is too short - must be at least 6 characters
Enter keystore password:
Re-enter new password:
What is your first and last name?
  [Unknown]:  veeru madhira
What is the name of your organizational unit?
  [Unknown]:  veeksha
What is the name of your organization?
  [Unknown]:  veeksha
What is the name of your City or Locality?
  [Unknown]:  nellore
What is the name of your State or Province?
  [Unknown]:  ap
What is the two-letter country code for this unit?
  [Unknown]:  IN
Is CN=veeru madhira, OU=veeksha, O=veeksha, L=nellore, ST=ap, C=IN correct?
  [no]:  yes

Enter key password for <veeru-demo>
        (RETURN if same as keystore password):
Re-enter new password:

Warning:
The JKS keystore uses a proprietary format. It is recommended to migrate to PKCS12 which is an industry standard format using "keytool -importkeystore -srckeystore veeru-demo.jks -destkeystore veeru-demo.jks -deststoretype pkcs12".
veeru@veerus-MacBook-Pro root % ls
EurekaClient    eurekaserver    m1              m3              pom.xml         root.iml        veeru-demo.jks
GateWay         feignclient     m2              m4              resttemplate    ssl
veeru@veerus-MacBook-Pro root % pwd
/Users/veeru/Softwares/Microservices-final/microservices-final/root
