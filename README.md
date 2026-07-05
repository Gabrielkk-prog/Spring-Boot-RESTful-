# Demo Spring Boot Application

A simple Spring Boot application that exposes a few basic REST endpoints and demonstrates dependency injection with a service layer.

## Features

- REST API built with Spring Boot Web
- Simple service-based message handling
- Basic POST request example with JSON input
- Unit and integration tests included

## Requirements

- Java 21
- Maven 3.9+ (or use the included Maven wrapper)

## Getting Started

1. Clone the repository.
2. Run the application:

```bash
./mvnw spring-boot:run
```

3. Open the app in your browser or API client:
   - http://localhost:9090/
   - http://localhost:9090/hello

## Available Endpoints

### GET /
Returns the configured greeting message.

### GET /hello
Returns the same greeting message as the home endpoint.

### POST /post
Accepts a JSON body like this:

```json
{
  "name": "Joao"
}
```

Response:

```text
hello World Joao
```

## Running Tests

```bash
./mvnw test
```

## Project Structure

- src/main/java: Application code
- src/main/resources: Configuration files such as application.properties
- src/test/java: Test classes
