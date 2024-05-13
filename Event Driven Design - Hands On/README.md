# Project Setup Guide

This README provides a comprehensive guide to setting up and running the project. Please follow the steps outlined below to ensure smooth setup and execution.

## Prerequisites
1. **Install Apache Kafka**: Apache Kafka is a prerequisite for running this project. Follow the instructions below for your respective operating system:

    - **Windows**:
        - Download Apache Kafka from the [official website](https://kafka.apache.org/downloads).
        - Extract the downloaded archive to a desired location.
        - Navigate to the Kafka directory.
        - Start Zookeeper:
            ```
            .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
            ```
        - Start Kafka server:
            ```
            .\bin\windows\kafka-server-start.bat .\config\server.properties
            ```

    - **Linux**:
        - Download Apache Kafka from the [official website](https://kafka.apache.org/downloads).
        - Extract the downloaded archive to a desired location.
        - Navigate to the Kafka directory.
        - Start Zookeeper:
            ```
            bin/zookeeper-server-start.sh config/zookeeper.properties
            ```
        - Start Kafka server:
            ```
            bin/kafka-server-start.sh config/server.properties
            ```

    - **macOS (Apple Silicon)**:
        - Install Apache Kafka using Homebrew:
            ```
            brew install kafka
            ```
        - Start Zookeeper:
            ```
            zookeeper-server-start /opt/homebrew/etc/kafka/zookeeper.properties
            ```
        - Start Kafka server:
            ```
            kafka-server-start /opt/homebrew/etc/kafka/server.properties
            ```

    - **macOS (Intel x86)**:
        - Install Apache Kafka using Homebrew:
            ```
            brew install kafka
            ```
        - Start Zookeeper:
            ```
            zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties
            ```
        - Start Kafka server:
            ```
            kafka-server-start /usr/local/etc/kafka/server.properties
            ```

2. **Java Installation**: Ensure Java is installed on your system. This project is configured with Java 21.

## Setting up the Project
1. **Open Project in IntelliJ**: Open IntelliJ IDEA and import the project.

2. **Load Maven Components**:
    - Once the project is imported, IntelliJ will automatically start loading Maven components.
    - Make sure all dependencies are successfully resolved.

3. **Configure Spring Boot**:
    - Set up SpringBoot configurations to start these services simultaneously - `email_service`, `inventory_service`, `order_service`.
If unable to, just start each service manually.

## Running the Project
1. **Start Services**:
    - Run the Spring Boot applications for `email_service`, `inventory_service`, `order_service`.
    - Ensure all services start without any errors.

2. **Execute API Call**:
    - Open `api.http` located in tests in the module `email_service`.
    - Execute the POST method defined there to test the API functionality.

## Additional Notes
- Make sure all configurations and dependencies are correctly set up before running the project.

---
### MSc. Konstantin Bogdanoski
### PhD. Kostadin Mishev
#### 16.05.2024
# Faculty of Computer Science and Engineering, Skopje