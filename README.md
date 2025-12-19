## Student Management System (Java)
 - A simple console-based Java application for managing students.
   The system allows adding, listing, and deleting students, with persistent storage using a    text file.

## Features
 - Add a student (ID, Name, GPA)
 - List all students
 - Delete a student by ID
 - Data is saved in students.txt (file-based persistence)

## Technologies
 - Java
 - File I/O (FileWriter, BufferedReader)
 - ArrayList
 - Scanner

##  Project Structure
 StudentManagementSystem/
 
 │
 
 ├── Main.java
 
 ├── Student.java
 
 ├── StudentService.java
 
 └── students.txt

## How to Run
 - Compile the project:
    1. javac Main.java
    2. Run the program: java Main

# Example Data Format (students.txt)
 - 1,Elena Smith,3.2
 - 2,Ana Smith,3.5

# Future Improvements
 - Update student information
 - Search student by ID
 - GPA filtering
 - Input validation enhancements

## Author: Elsa Krasniqi
