# Promotion Engine 

A Spring Boot–based backend project designed to calculate the total price of items in a cart after applying active promotions.

##  Problem Statement

Build a modular promotion engine that can:
- Apply "fixed price for n items" promotions (e.g., 3 A's for 130)
- Apply "combo" promotions (e.g., C + D for 30)
- Be extensible for future promotion types
- Use clean OOP design, adhere to TDD, and support unit testing

---

##  Tech Stack

- Java 21
- Spring Boot 3.x
- Maven
- JUnit 5 (with TDD principles)

---

##  Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/akshatvermavi/promotionengine.git

cd promotionengine

2. Build the Project
mvn clean install

3. Run the Application
./mvnw spring-boot:run

The app will be running at:
http://localhost:8080

API Endpoint
POST /api/promotions/total
Request Body (JSON)

[
  { "sku": { "id": "A", "unitPrice": 50 }, "quantity": 3 },
  { "sku": { "id": "B", "unitPrice": 30 }, "quantity": 5 },
  { "sku": { "id": "C", "unitPrice": 20 }, "quantity": 1 },
  { "sku": { "id": "D", "unitPrice": 15 }, "quantity": 1 }
]

Response
280





