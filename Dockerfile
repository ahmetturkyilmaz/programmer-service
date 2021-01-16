FROM openjdk:8-jre-alpine
ARG JAR_FILE
ADD ${JAR_FILE} programmer-service-RELEASE.jar