FROM amazoncorretto:17-alpine-jdk
MAINTAINER marceph
COPY target/marceph-0.0.1-SNAPSHOT.jar marceph-app.jar
ENTRYPOINT ["java","-jar","/marceph-app.jar"]
