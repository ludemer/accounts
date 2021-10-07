FROM mcr.microsoft.com/java/jre:8-zulu-alpine  AS Build_accounts
WORKDIR   /
EXPOSE 8080
COPY  .   /
RUN ls /
#ENTRYPOINT exec java -cp "gxclassR.jar;jt400.jar;xercesImpl.jar;joda-time-2.8.2.jar;mysql-connector-java-5.1.11-bin.jar;commons-io-2.2.jar" com.genexus.ToolsPrograms 
#ENTRYPOINT exec java -cp "gxclassR.jar";"jt400.jar";"xercesImpl.jar";"joda-time-2.8.2.jar";"mysql-connector-java-5.1.11-bin.jar";"commons-io-2.2.jar" com/b2brestv1/accounts/asndupdatedaccounts uat AR 100
ENTRYPOINT exec java -cp "..\gxclassR.jar ". "..\jt400.jar "..\xercesImpl.jar "..\joda-time-2.8.2.jar "..\mysql-connector-java-5.1.11-bin.jar "..\commons-io-2.2.jar" com/b2brestv1/accounts/asndupdatedaccounts uat AR 100
#com/b2brestv1/accounts/asndupdatedaccounts uat AR 100
