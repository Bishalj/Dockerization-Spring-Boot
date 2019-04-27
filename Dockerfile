FROM gradle:4.9-alpine
EXPOSE 8005
#ENV MONGO_URL mongodb://localhost/test
COPY build/libs/Spring-Boot-Docker-0.0.1-SNAPSHOT.jar ./Spring-Boot-Docker-01.jar
ENTRYPOINT ["java", "-jar", "./Spring-Boot-Docker-01.jar"]

