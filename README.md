# Profile Card Generator – Spring Boot Backend

This project is a backend application developed using **Java and Spring Boot**.  
It provides REST APIs to manage user profile cards and demonstrates how a frontend application communicates with a backend system using APIs and a database.

---

## Why This Project?

While learning backend development, I wanted to understand how:
- Java applications interact with databases
- REST APIs are designed and exposed
- Business logic is separated from controllers
- JPA simplifies database operations compared to JDBC

This project helped me gain hands-on experience with **real-world backend architecture**.

---

## Tech Stack Used

- Java  
- Spring Boot  
- Spring Data JPA  
- Hibernate  
- MySQL  
- REST APIs  
- Maven  

---

## Project Architecture

The application follows a **layered architecture**:

- **Controller Layer**  
  Handles incoming HTTP requests from the frontend and sends responses.

- **Service Layer**  
  Contains all business logic and validations.  
  Acts as an intermediate layer between Controller and Repository.

- **Repository Layer**  
  Handles database operations such as create, read, update, and delete using Spring Data JPA.

- **Entity Layer**  
  Represents database tables using Java classes and maps fields to table columns.

---

## Features Implemented

- Create user profile cards using REST APIs  
- Fetch all user profiles from the database  
- CRUD operations handled using JPA (no manual SQL queries)  
- Automatic table creation and mapping using Hibernate  
- Input validation using annotations  
- Clean separation of concerns using Controller–Service–Repository pattern  

---

## API Endpoints

| HTTP Method | Endpoint | Description |
|-----------|----------|-------------|
| POST | `/api/profiles` | Create a new profile |
| GET | `/api/profiles` | Retrieve all profiles |

---

## Database Details

- **Database Used:** MySQL  
- **ORM Tool:** Hibernate  
- Database tables are automatically created based on entity classes.  
- Primary keys are generated automatically using `@GeneratedValue`.

---

## How the Application Works

1. Frontend sends a request through a REST API.
2. Controller receives the request.
3. Service layer validates and processes the request.
4. Repository interacts with the database using JPA.
5. Response is sent back to the frontend.

---

## How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/ShrutiND/profile-card-generator.git
2. Open the project in an IDE (IntelliJ / VS Code).
3. Configure MySQL details in application.properties.
4. Run the Spring Boot application.
5. Access the APIs at: http://localhost:8080


**Learning Outcomes :
1.Understood why JPA is preferred over JDBC

2.Learned how entity classes map to database tables

3.Implemented REST APIs using Spring Boot

4.Applied layered architecture in a real project

5.Improved understanding of backend request–response flow
