FROM openjdk:8
COPY ./target/calculatorDevOps-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "./calculatorDevOps-1.0-SNAPSHOT-jar-with-dependencies.jar"]
