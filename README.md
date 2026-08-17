# Full Stack Project

A full-stack web application currently under development, built with **Java, Spring Boot, PostgreSQL, HTML, CSS, and JavaScript**.

The project is being developed as a learning and practical application to explore modern full-stack development, REST APIs, database integration, and frontend-backend communication.

## Technologies

### Backend

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven

### Database

- PostgreSQL

### Frontend

- HTML5
- CSS3
- JavaScript

### Tools

- Git
- GitHub
- Visual Studio Code
- pgAdmin 4

## Project Structure

```text
project/
├── frontend/
│   ├── index.html
│   ├── css/
│   └── js/
│
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   └── resources/
│   │   └── test/
│   ├── pom.xml
│   └── .gitignore
│
└── README.md
```

## Backend

The backend is built with Spring Boot and provides a REST API for communication with the frontend.

The application currently includes a basic test endpoint:

```http
GET /api/test
```

Response:

```text
Backend Working!
```

This endpoint is used to verify that the Spring Boot server is running correctly.

## Database

The project uses **PostgreSQL** as its relational database.

Database integration is handled through **Spring Data JPA** and **Hibernate**.

> Database credentials and other sensitive configuration files are not included in this repository.

## Frontend

The frontend is built using standard web technologies:

- HTML
- CSS
- JavaScript

It will communicate with the Spring Boot backend through HTTP requests and JSON data.

## Running the Project

### Prerequisites

Make sure you have installed:

- Java JDK
- Maven
- PostgreSQL
- Git

### Clone the repository

```bash
git clone https://github.com/Bernardo-Silveira/HTML-CSS-JS-JAVA.git
cd YOUR_PROJECT_FOLDER
```

### Run the backend

Navigate to the backend directory:

```bash
cd backend
```

Then run:

```bash
mvn spring-boot:run
```

The backend will normally be available at:

```text
http://localhost:8080
```

### Test the API

Open:

```text
http://localhost:8080/api/test
```

If everything is working correctly, the API should return:

```text
Backend Working!
```

## Environment Configuration

Local database credentials should be configured separately and should **never be committed to GitHub**.

For example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/DATABASE_NAME
spring.datasource.username=DATABASE_USER
spring.datasource.password=DATABASE_PASSWORD
```

Use your own local PostgreSQL credentials when configuring the application.

## Goals

The main goals of this project are to:

- Practice full-stack development
- Build REST APIs with Spring Boot
- Work with relational databases
- Connect frontend applications to backend APIs
- Practice Git and GitHub workflows
- Develop a complete application from frontend to database

## License

This project is currently intended for educational and personal development purposes.
