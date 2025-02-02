FROM amazoncorretto:17-alpine-jdk
WORKDIR /app
EXPOSE 8080
COPY ./target/backend-test-deploy-0.0.1-SNAPSHOT.jar back-test-deploy.jar

ENTRYPOINT [ "java", "-jar", "back-test-deploy.jar"]