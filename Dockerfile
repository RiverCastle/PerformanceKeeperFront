FROM openjdk:17-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dserver.port=${PORT}", "-Dserver.env=${ENV}", "-jar", "app.jar"]