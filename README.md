# Student Management System (Java)

A simple **console-based Student Management System** built in **Java**, demonstrating core **Object-Oriented Programming (OOP)** concepts and **file persistence using JSON** with the **Gson** library.

This project allows users to **add, view, search, and remove students**, with all data stored locally in a `students.json` file.

---

## Features

- Add new students  
- View all students  
- Search students by ID  
- Remove students by ID  
- Persistent storage using JSON  
- Clean OOP design (separation of concerns)

---

## Technologies Used

- **Java** (Core Java, OOP)
- **Gson** (JSON serialization/deserialization)
- **File I/O**
- **ArrayList**
- **Console-based UI**

---


## Class Overview

### Student

Represents a student entity.

**Attributes:**
- `studentId`
- `name`
- `course`
- `averageMark`

Includes getters, setters, a constructor, and a `toString()` method.

---

### StudentManager

Handles all student-related operations and data persistence.

**Responsibilities:**
- Add students  
- Remove students by ID  
- Search students by ID  
- Load data from `students.json`  
- Save data to `students.json`

---

### Main

Provides a **menu-driven console interface** for interacting with the system.

---

## How to Run

1. Clone or download the project  
2. Ensure **Gson** is available in your classpath  
   - If using an IDE, add `gson.jar`  
   - Or use **Maven/Gradle** if preferred 

---

## Learning Outcomes
This project demonstrates:
Object-Oriented Programming in Java
File handling and persistence
JSON serialization/deserialization
Clean separation between UI, logic, and data
Practical use of collections (ArrayList)
---
## Possible Improvements
Input validation (duplicate IDs, mark range checks)
Update/edit student details
Sort and filter students
GUI version (JavaFX or Swing)
Database integration (MySQL/PostgreSQL)
