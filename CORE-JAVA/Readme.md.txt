Requirements
- Java 8 or later
- MySQL Server
- MySQL JDBC driver (`mysql-connector-java`)

Database Setup
sql:

CREATE DATABASE school;
USE school;
CREATE TABLE students (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  grade INT
);
