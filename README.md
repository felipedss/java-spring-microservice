# java-spring-microservice

This is a simple example of a Spring application that can be deployed using docker

## Build

Packaging the application

`mvn clean package`

Now, Let`s build the docker image for this application:

`docker build -t java-spring-microservice .`

## Run

To run the container:

`docker run -p 8080:8080 java-spring-microservice`