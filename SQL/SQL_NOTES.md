# SQL Notes

## What is SQL?
SQL (**Structured Query Language**) is a standard language used to access and manipulate databases.

- SQL allows users to execute queries, retrieve, insert, update, and delete records in a database.
- It became a standard of the **American National Standards Institute (ANSI)** in 1986 and **International Organization for Standardization (ISO)** in 1987.

## What Can SQL Do?
- Execute queries against a database
- Retrieve data from a database
- Insert, update, and delete records in a database
- Create new databases and tables
- Define and manage stored procedures
- Create views for data abstraction
- Set permissions on tables, procedures, and views

---

## Relational Database Management System (RDBMS)
**RDBMS (Relational Database Management System)** is the foundation for SQL databases. It stores data in structured tables with relationships between them.

### Features of RDBMS:
- Data is stored in **tables** (rows & columns)
- Enforces **ACID properties** (Atomicity, Consistency, Isolation, Durability)
- Supports **relationships** (Primary Key, Foreign Key)
- Allows **data integrity constraints** (NOT NULL, UNIQUE, CHECK, etc.)

Popular RDBMS include **MySQL, PostgreSQL, SQL Server, Oracle, and SQLite**.

---

## Important SQL Commands

### Data Retrieval
- `SELECT` – Extracts data from a database.

  ```sql
  SELECT * FROM employees;
  ```

### Data Manipulation
- `INSERT INTO` – Inserts new data into a table.
  
  ```sql
  INSERT INTO employees (id, name, age) VALUES (1, 'John Doe', 30);
  ```
- `UPDATE` – Updates existing data.
  
  ```sql
  UPDATE employees SET age = 31 WHERE id = 1;
  ```
- `DELETE` – Deletes records from a table.
  
  ```sql
  DELETE FROM employees WHERE id = 1;
  ```

### Database Management
- `CREATE DATABASE` – Creates a new database.
  
  ```sql
  CREATE DATABASE company_db;
  ```
- `ALTER DATABASE` – Modifies a database.
  
  ```sql
  ALTER DATABASE company_db CHARACTER SET utf8;
  ```

### Table Management
- `CREATE TABLE` – Creates a new table.
  
  ```sql
  CREATE TABLE employees (
      id INT PRIMARY KEY,
      name VARCHAR(100),
      age INT
  );
  ```
- `ALTER TABLE` – Modifies an existing table.
  
  ```sql
  ALTER TABLE employees ADD COLUMN salary INT;
  ```
- `DROP TABLE` – Deletes a table.
  
  ```sql
  DROP TABLE employees;
  ```

### Indexing
- `CREATE INDEX` – Creates an index to improve query performance.
  
  ```sql
  CREATE INDEX idx_name ON employees(name);
  ```
- `DROP INDEX` – Deletes an index.
  
  ```sql
  DROP INDEX idx_name ON employees;
  ```

---

## Additional Notes
- SQL is **not case-sensitive**, but it's a good practice to write SQL keywords in uppercase.
- SQL supports various **constraints** like `PRIMARY KEY`, `FOREIGN KEY`, `NOT NULL`, `UNIQUE`, and `CHECK`.
- Advanced SQL concepts include **Joins, Subqueries, Views, Stored Procedures, and Transactions**.

---