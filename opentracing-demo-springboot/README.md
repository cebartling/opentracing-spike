# OpenTracing Spring Boot demo application

## Installation

1. Build the JAR file: `mvn clean install`
1. Build the Docker image: `docker build -t opentracing-demo-springboot .`
1. Run the Docker image as a container instance: `docker run -p 5000:8080 opentracing-demo-springboot`
1. Navigate a web browser to [http://localhost:5000](http://localhost:5000).