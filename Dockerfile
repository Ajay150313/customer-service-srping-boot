FROM adoptopenjdk/openjdk11:jre-11.0.11_9-alpine@sha256:352bcf6c11b2670e66f32049fbf281393c3e6b5f53b7147e278ebec96478dff8
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]