# Kafka Docker Example

This project demonstrates how to run a Spring Boot application with Apache Kafka using Docker Compose. It accompanies the blog post:  
📖 [Running a Spring App with Kafka Using Docker Compose](https://medium.com/@denizhan.aras/running-a-spring-app-with-kafka-using-docker-compose-fb74eb847678)

## 🛠️ Project Structure

- **docker-compose.yml** — Sets up the Kafka and Zookeeper containers.
- **Dockerfile** — Creates a java image for spring app.
- **spring-kafka-producer** — A simple Spring Boot application that sends messages to a Kafka topic.

## 🚀 Getting Started

### Prerequisites

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

### 1. Clone the repository

```bash
git clone https://github.com/arasdenizhan/kafka-docker-example.git
cd kafka-docker-example
```

### 2. Start Kafka and Zookeeper

```bash
mvn clean install
cd docker
docker-compose up -d
```

This will start:
- **Zookeeper** on port `2181`
- **Kafka** on port `9092`
- **Spring App** on port 8081

## ✅ What This Project Demonstrates

- Setting up **Apache Kafka** with **Zookeeper** using **Docker Compose**
- Creating a basic **Spring Boot Kafka Producer**
- Sending and receiving Kafka messages using the default topic: `denizhan-topic`

## 📦 Kafka UI

You can go to localhost:8080 to view the Kafka UI.
```
http://localhost:8080
```

## 🧼 Clean Up

To stop and remove the Docker containers:

```bash
docker-compose down
```

## 📄 License

This project is for educational purposes and follows the examples discussed in the related blog post. Use freely under the MIT License.

---

Created by [Denizhan Aras](https://medium.com/@denizhan.aras)
