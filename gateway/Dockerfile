FROM maven:3.8.4-openjdk-21-slim As builder

WORKDIR /app
COPY ./src ./src
RUN mvn clean package

FROM openjdk:21-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} gateway-service.jar

ENTRYPOINT ["java", "-jar", "/gateway-service.jar" ]