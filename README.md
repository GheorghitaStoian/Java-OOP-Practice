# Student Management – Java Console Project

This is a simple Java console application that manages a student's situation, including:
- number of absences
- laboratory grade
- exam grade
- arithmetic average
- special status check (too many absences or grades below passing limit)
- final grade calculation based on weight percentages

The program runs in the terminal and provides an interactive menu.

---

## 📌 Features

### ✔ Add Absences  
The user can input the number of absences for the student.

### ✔ Set Laboratory / Exam Grades  
Both grades can be updated at any time during execution.

### ✔ Display Student Status  
Shows:
- absences  
- laboratory grade  
- exam grade  
- arithmetic average  

### ✔ Special Status Check  
The program determines whether the student:
- has too many absences (≥ 8)
- has grades below the passing limit (grade < 5)

If everything is valid, the final grade is computed based on:
- laboratory: **60%**
- exam: **40%**

---

## ▶ How to Run

Compile and run the program using the terminal:

```bash
javac exercitiu.java
java exercitiu
