# Hello World RESTful Web Service

## Overview

This project is part of the **Cognizant Deep Skilling Program**.
It demonstrates a simple RESTful web service using **Spring Boot** that returns a "Hello World RESTful Web Service" message.

---

## Technologies Used

- Java 17
- Spring Boot
- Maven
- REST API
- IntelliJ IDEA
- Postman

---

## Project Structure

```
spring-learn
│── src/main/java/com/cognizant/springlearn
│   ├── SpringLearnApplication.java
│   └── controller
│       └── HelloController.java
│
│── src/main/resources
│   └── application.properties
│
│── pom.xml
```

---

---

## Configuration

`application.properties`

```
server.port=8083
spring.application.name=spring-learn
```

---

## REST Endpoint Details

| Method | URL    | Description                                     |
| ------ | ------ | ----------------------------------------------- |
| GET    | /hello | Returns Hello World RESTful Web Service message |

### 🔹 Controller Details

- Class: `HelloController`
- Method: `sayHello()`

---

## 📥 Sample Request

```
http://localhost:8083/hello
```

---

## 📤 Sample Response

```
Hello World RESTful Web Service
```

---

## Console Logs

```
START - sayHello()
END - sayHello()
```

---

## Testing

### ✔ Browser

- Open: `http://localhost:8083/hello`

### ✔ Postman

- Method: GET
- URL: `http://localhost:8083/hello`

---

## HTTP Headers Observation

### Browser (Network Tab)

- Status: 200 OK
- Content-Type: text/plain

### Postman (Headers Tab)

- Content-Type: text/plain;charset=UTF-8
- Content-Length: 13

---

## Learning Outcomes

- Understanding REST APIs
- Creating controllers using Spring Boot
- Handling HTTP GET requests
- Inspecting HTTP headers
- Running Spring Boot applications

---

## Conclusion

This exercise successfully demonstrates a basic RESTful web service using Spring Boot, forming the foundation for building more complex APIs.

---
