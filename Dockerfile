FROM openjdk:8
COPY ./target/nick-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "nick-1.0-SNAPSHOT-jar-with-dependencies.jar"]