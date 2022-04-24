FROM java:8-jdk-alpine
COPY ./m1/target/m1-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8111
ENTRYPOINT ["java", "-jar", "m1-0.0.1-SNAPSHOT.jar"]