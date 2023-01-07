FROM openjdk:11-jdk-slim
WORKDIR /app
COPY target/payroll-api-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]