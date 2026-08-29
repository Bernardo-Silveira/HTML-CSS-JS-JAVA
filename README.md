# Full Stack Project

A full-stack web application built with **Java, Spring Boot, PostgreSQL, HTML, CSS, and JavaScript**.

The project demonstrates a simple client registration flow from the frontend to a REST API and PostgreSQL database.

## Technologies

### Backend

- Java 26
- Spring Boot
- Spring Security
- Spring Web MVC
- Spring Data JPA
- Hibernate
- Bean Validation
- Maven

### Database

- PostgreSQL

### Frontend

- HTML5
- CSS3
- JavaScript
- Bootstrap 5

### Tools

- Git
- GitHub
- Visual Studio Code
- pgAdmin 4

## Project Structure

```text
HTML-CSS-JS-JAVA/
├── frontend/
│   ├── css/
│   ├── js/
│   ├── img/
│   └── index.html
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
├── .gitignore
└── README.md
```

## API

### Register a client

```http
POST /api/clients
Content-Type: application/json
```

Example request:

```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "password123"
}
```

The password is validated and stored using BCrypt hashing. The API response intentionally contains only the client's `id`, `name`, and `email`, never the password.

### Validation

- Name is required.
- Email is required and must have a valid email format.
- Password is required and must contain at least 8 characters.
- An email cannot be registered more than once.

## Database

The application uses **PostgreSQL** with **Spring Data JPA** and **Hibernate**.

Database credentials are intentionally excluded from Git. Copy the example configuration to a local `application.properties` file and replace the placeholders with your own credentials.

## Running the Project

### Prerequisites

Install:

- Java JDK 26
- Maven
- PostgreSQL
- Git

### Clone

```bash
git clone https://github.com/Bernardo-Silveira/HTML-CSS-JS-JAVA.git
cd HTML-CSS-JS-JAVA
```

### Configure the database

Create a PostgreSQL database, then create `backend/src/main/resources/application.properties` using the example configuration in `application-example.properties`.

### Run the backend

```bash
cd backend
mvn spring-boot:run
```

The API runs at:

```text
http://localhost:8080
```

### Run the frontend

Serve the `frontend` directory using a local development server such as VS Code Live Server. The current CORS configuration allows:

```text
http://localhost:5500
http://127.0.0.1:5500
```

Open `frontend/index.html` through the development server and submit the registration form.

## Security Notes

- Passwords are hashed with BCrypt before being stored.
- Local `application.properties` files are ignored by Git.
- The API does not return password hashes to the frontend.
- CSRF is disabled because the current application exposes a stateless JSON API. Authentication/authorization can be expanded as the project evolves.

## Goals

- Practice full-stack development.
- Build REST APIs with Spring Boot.
- Work with PostgreSQL and JPA.
- Connect a JavaScript frontend to a Java backend.
- Practice validation and password hashing.
- Improve Git and GitHub workflows.

## License

This project is currently intended for educational and personal development purposes.
