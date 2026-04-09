FROM eclipse-temurin:21-jdk
COPY src/additionExample/Addition.java app
WORKDIR /app
RUN javac Addition.java
CMD ["java", "Addition"]