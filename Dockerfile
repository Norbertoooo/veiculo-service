FROM eclipse-temurin:17-jdk-alpine
COPY target/veiculo-service-*.jar veiculo-service.jar
CMD ["java", "-jar", "veiculo-service.jar"]