FROM mcr.microsoft.com/java/jre:8-zulu-alpine
#WORKDIR   /home
EXPOSE 8080
COPY  test  .
#ARG ${jarfile}=jar/
ARG  ${jarfile}=jar/joda-time-2.8.2.jar
ADD ${JAR_FILE}  joda-time-2.8.2.jar
RUN  cat test
RUN ls /


#CMD ["Java","-jar","/home/joda-time-2.8.2.jar"]
#ENTRYPOINT ["java -version"]
##ENTRYPOINT ["java","-jar","/home/joda-time-2.8.2.jar" com/b2brestv1/accounts/asndupdatedaccounts uat AR 100"]
#FROM openjdk:8-jdk

#ARG MAVEN_VERSION=3.8.2
#ARG USER_HOME_DIR="/root"
#ARG SHA=b0bf39460348b2d8eae1c861ced6c3e8a077b6e761fb3d4669be5de09490521a74db294cf031b0775b2dfcd57bd82246e42ce10904063ef8e3806222e686f222
#ARG BASE_URL=https://apache.osuosl.org/maven/maven-3/${MAVEN_VERSION}/binaries

#RUN mkdir -p /usr/share/maven /usr/share/maven/ref \
 # && curl -fsSL -o /tmp/apache-maven.tar.gz ${BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
 # && echo "${SHA}  /tmp/apache-maven.tar.gz" | sha512sum -c - \
 # && tar -xzf /tmp/apache-maven.tar.gz -C /usr/share/maven --strip-components=1 \
 # && rm -f /tmp/apache-maven.tar.gz \
  #&& ln -s /usr/share/maven/bin/mvn /usr/bin/mvn


#ENV MAVEN_HOME /usr/share/maven
#ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"

#ADD . /usr/share/maven/
#ENTRYPOINT ["ls /usr/share/maven/"]
#ENTRYPOINT ["java -version"]
#ENTRYPOINT ["java"/usr/share/maven/gxclassR.jar;/usr/share/maven/jt400.jar;xercesImpl.jar;/usr/share/maven/joda-time-2.8.2.jar;/usr/share/maven/mysql-connector-java-5.1.11-bin.jar;/usr/share/maven/commons-io-2.2.jar" com/b2brestv1/accounts/asndupdatedaccounts uat AR 100"]
