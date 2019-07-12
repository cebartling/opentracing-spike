# OpenTracing API spike solution

Spike solution around using OpenTracing API and various tools for observability of microservices.

## Running the spike solution

1. Start docker-compose from the project root directory: `docker-compose up`

## Clean up

1. Stop the docker-compose process: `Control-C`
1. Stop docker-compose: `docker-compose down`
1. Clean up the mounted volumes: `docker system prune --volumes --force`
1. Optional: If you want to clean up the docker images that were pulled: `docker system prune --all --force`


