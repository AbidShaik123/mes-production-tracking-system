# 🏭 MES Production Tracking System

A **Manufacturing Execution System (MES) simulation project** built with **Java, Spring Boot, MySQL, and REST APIs** to demonstrate core manufacturing execution and shop-floor production tracking concepts.

> 🚧 **Project Status: In Development**

## 📌 Project Overview

The MES Production Tracking System simulates how a manufacturing execution system manages and tracks production activities between enterprise systems and shop-floor operations.

The application is designed to support:

* Production Order Management
* Work Order Execution
* Equipment Status Tracking
* Material Consumption
* Product Genealogy & Traceability
* Production Status Management
* Manufacturing Data Collection
* ERP-to-MES Integration

## 🔄 Manufacturing Workflow

```text
              ERP / SAP Simulator
                     |
                     | Production Order
                     v
            +------------------+
            |       MES        |
            | Production       |
            | Tracking System  |
            +--------+---------+
                     |
                     v
              Production Order
                     |
                     v
                 Work Order
                     |
                     v
            Equipment Execution
                     |
                     v
            Material Consumption
                     |
                     v
          Genealogy & Traceability
                     |
                     v
            Production Complete
                     |
                     v
             ERP Confirmation
```

## ⚙️ Technology Stack

| Technology      | Purpose                            |
| --------------- | ---------------------------------- |
| Java 17         | Backend development                |
| Spring Boot     | Application framework              |
| Spring Data JPA | Database persistence               |
| MySQL           | Manufacturing data storage         |
| REST APIs       | Application and system integration |
| Maven           | Dependency and build management    |
| Postman         | API testing                        |
| Git & GitHub    | Version control                    |

## 🧩 Planned MES Modules

### 📋 Production Orders

Create and manage manufacturing production orders through their complete lifecycle.

**Status Flow:**

`CREATED → RELEASED → IN_PROGRESS → COMPLETED`

### 🔧 Work Orders

Break production orders into executable manufacturing operations and track their progress.

### 🏭 Equipment Tracking

Maintain equipment information and manufacturing status.

Example statuses:

`RUNNING` • `IDLE` • `DOWN` • `MAINTENANCE`

### 📦 Material Consumption

Record raw materials and lots consumed during production execution.

### 🔎 Genealogy & Traceability

Associate raw-material lots with production orders and finished-product lots to provide manufacturing traceability.

### 🔗 ERP–MES Integration

Simulate production-order communication between an ERP system and MES using REST APIs.

## 🌐 Planned REST APIs

```text
POST   /api/production-orders
GET    /api/production-orders
GET    /api/production-orders/{id}

PUT    /api/production-orders/{id}/release
PUT    /api/production-orders/{id}/start
PUT    /api/production-orders/{id}/complete

POST   /api/work-orders
GET    /api/work-orders

POST   /api/material-consumption

GET    /api/genealogy/{productionOrderId}

GET    /api/equipment
PUT    /api/equipment/{id}/status
```

## 📂 Planned Project Structure

```text
src/main/java/com/abid/mes/
│
├── controller/
├── service/
├── repository/
├── entity/
├── dto/
├── exception/
├── config/
│
└── MesProductionTrackingSystemApplication.java
```

## 🎯 Project Goals

This project is being developed to demonstrate practical understanding of:

* Manufacturing Execution Systems (MES)
* Production Execution
* Manufacturing Workflows
* Material Tracking
* Product Genealogy
* Track & Trace
* Shop-Floor Data Management
* Enterprise System Integration
* Java/Spring Boot Backend Development
* REST API Design
* Relational Database Design

## 🗺️ Development Roadmap

* [x] Create GitHub repository
* [ ] Initialize Spring Boot application
* [ ] Configure MySQL database
* [ ] Implement Production Order module
* [ ] Implement Work Order module
* [ ] Implement Equipment module
* [ ] Implement Material Consumption
* [ ] Implement Genealogy & Traceability
* [ ] Add ERP integration simulation
* [ ] Add API validation and exception handling
* [ ] Test APIs with Postman
* [ ] Add Swagger/OpenAPI documentation
* [ ] Dockerize application
* [ ] Add screenshots and API examples

## ⚠️ Disclaimer

This is an **independent personal learning and portfolio project** that simulates common Manufacturing Execution System concepts.

It is **not Siemens Opcenter software**, does not contain Siemens proprietary code, and is not affiliated with or endorsed by Siemens.

## 👨‍💻 Author

**Abid Shaik**

MES Engineer | Manufacturing Systems | Industrial Integration | Software Engineering

---

⭐ If you find this project interesting, feel free to explore the repository as development progresses.
