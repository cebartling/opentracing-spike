# OpenTracing API spike solution

Spike solution around using OpenTracing API and various tools for observability of microservices.

## Build the Docker images

### Spring Boot

1. Change directory to *opentracing-demo-springboot*: `cd opentracing-demo-springboot`
1. Execute the Maven build: `mvn clean install`
1. Build the Spring Boot Docker image: `docker build -t opentracing-demo-springboot .`
1. Change directory to the parent directory: `cd ..`

### ASP.NET Core

1. Change directory to *opentracing-demo-aspnetcore*: `cd opentracing-demo-aspnetcore`
1. Build the Docker image for this ASP.NET Core web application: `docker build -t opentracing-demo-aspnetcore .`
1. Change directory to the parent directory: `cd ..`


## Running the spike solution

1. Start docker-compose from the project root directory: `docker-compose up`
1. View the Zipkin server UI at [http://localhost:9411/zipkin/](http://localhost:9411/zipkin/). 

## Clean up

1. Stop the docker-compose process: `Control-C`
1. Stop docker-compose: `docker-compose down`
1. Clean up the mounted volumes: `docker system prune --volumes --force`
1. Optional: If you want to clean up the docker images that were pulled: `docker system prune --all --force`
