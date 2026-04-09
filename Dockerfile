# Step 1: Use a Java Runtime environment 
FROM eclipse-temurin:21-jdk

# Step 2: Copy your Java file into the container
COPY src/additionExample/Addition.java /app/Addition.java

# Step 3: Set the working directory
WORKDIR /app

# Step 4: Compile the Java code
RUN javac Addition.java

# Step 5: Run the application
CMD ["java", "Addition"]