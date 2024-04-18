FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/caisse-0.0.1-SNAPSHOT.jar /app
EXPOSE 8088
CMD ["java", "-jar", "caisse-0.0.1-SNAPSHOT.jar"]