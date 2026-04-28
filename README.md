# Expense Tracker App 💰

[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-brightgreen)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/Database-MongoDB-brightgreen)](https://www.mongodb.com/)
[![Frontend](https://img.shields.io/badge/Frontend-HTML/CSS/JS-yellow)](#)

A **full-stack Expense Tracker application** built with **Spring Boot**, **MongoDB**, and **JavaScript**.  
Users can register, log in, add transactions, and view dynamic reports for expenses, income, and balances.

---

## Features

### User
- Register and login securely
- Add income and expense transactions
- View transaction history
- See dynamic balance, income, and expense reports

### Backend
- RESTful APIs for user authentication and transaction management
- Service and repository layers for clean architecture
- MongoDB database integration via Spring Data MongoDB

### Frontend
- Static HTML pages with CSS styling and JavaScript functionality
- Responsive forms for login, registration, and transactions
- Dynamic transaction reporting

---

## Tech Stack

- **Backend:** Java, Spring Boot, Spring Data MongoDB, MongoDB  
- **Frontend:** HTML, CSS, JavaScript  
- **Database:** MongoDB  
- **Build Tool:** Maven  
- **IDE:** IntelliJ IDEA (Backend), VS Code (Frontend)  

---

## Installation

1. Clone the repository:
```bash
git clone https://github.com/Jerrwin/Expense-Tracker.git
```
2. Import the backend Spring Boot project in IntelliJ IDEA.
3. Ensure MongoDB is installed and running locally.
4. Use the default MongoDB URI in `src/main/resources/application.properties` or update it as needed:
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/expense_tracker
spring.data.mongodb.database=expense_tracker
```
5. Run the Spring Boot backend application (it will start on http://localhost:8080 by default).  
6. Open the frontend folder (`Expense-Tracker-Frontend/`) in VS Code or any code editor.  
7. Open the HTML files in your browser or use a live server extension to view the app.  

---

## Contributing

Feel free to fork the repo, submit issues, or create pull requests.  
Maintain the project structure and coding style.
