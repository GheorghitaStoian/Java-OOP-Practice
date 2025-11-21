# Java OOP Practice – Student Management (Console + GUI)

This repository contains a simple Java project built for practicing basic OOP concepts.  
The project is implemented in **two different versions**:

---

## 🎯 Project Overview

The goal of the project is to manage a student's academic status, including:
- number of absences
- laboratory grade
- exam grade
- arithmetic average
- eligibility to pass the course
- final grade calculation based on weighted percentages

The same logic is implemented twice:
1. **Console Application (CLI)** – fully text-based interaction  
2. **Graphical User Interface (GUI)** – implemented using Java Swing

Both versions use the same underlying object-oriented model (the `Student` class).

---

## 🖥️ Console Version (CLI)

The console version allows the user to:

- Enter absences  
- Set lab grade  
- Set exam grade  
- Display student status  
- Check special status (too many absences or grades below minimum)  

The application uses a simple interactive menu in the terminal.

---

## 🪟 GUI Version (Swing)

The GUI version features the same functionality as the console version, but with a graphical interface built using **Java Swing**.

Users can:
- Add absences  
- Set lab and exam grades  
- View student status  
- Check special status  
- See all results updated inside a scrollable text area

The GUI version does **not** require JavaFX and works with any standard Java installation.

---

## 📦 Object-Oriented Structure

Both versions share the same core OOP logic:

### `Student.java`  
Contains the student data and business logic:
- storing grades and absences  
- updating values  
- calculating averages and final grades  
- checking special conditions  

### `StudentGUI.java`  
Graphical interface built with Swing components:
- Buttons  
- Text fields  
- Labels  
- Text area output  

### `exercitiu.java` (console version)  
Implements the terminal menu and user input logic using `Scanner`.

---

## 🚀 How to Run

### **Console version**
Compile and run:
```bash
javac exercitiu.java
java exercitiu
```

### **GUI version**
```bash
javac Student.java StudentGUI.java
java StudentGUI
