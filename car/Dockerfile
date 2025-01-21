FROM maven:3.8.4-openjdk-21-slim As builder

WORKDIR /app
COPY ./src ./src
RUN mvn clean package

FROM openjdk:21-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} car-service.jar

ENTRYPOINT ["java", "-jar", "/car-service.jar" ]