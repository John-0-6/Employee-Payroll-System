# Employee Payroll System (Console-Based)

A **console-based Employee Payroll System** built in **Java** using **Object-Oriented Programming (OOP)** principles. This system manages **full-time and part-time employees**, calculates salaries, overtime bonuses, and accumulated 13th-month pay.

---

## Features

- Add employees (Full Time / Part Time)
- Display all employees
- Display only Full Time employees
- Display only Part Time employees
- Salary computation based on:
  - Attendance
  - Hourly rate
  - Overtime hours
  - 13th-month pay
- Menu-driven console interface

---

## OOP Concepts Used

- **Abstraction**
  - `Employees` abstract class
- **Inheritance**
  - `FullTimeEmployee` and `PartTimeEmployee`
- **Polymorphism**
  - Salary computation via overridden methods
- **Encapsulation**
  - Protected and private fields
- **Separation of Concerns**
  - `Main`, `EmployeeManager`, employee types, and salary logic

---

## Technologies Used

- Java  
- `Scanner` for user input  
- `ArrayList` for dynamic employee storage  

---

## Salary Computation Logic

### Full-Time Employee
- Hourly Rate: ₱87  
- Monthly Salary = Attendance × 8 × Hourly Rate  
- Overtime Bonus = Overtime Hours × (Hourly Rate × 25%)  
- 13th Month Pay = (Monthly Salary ÷ 12) × (Attendance ÷ 22)

### Part-Time Employee
- Hourly Rate: ₱90  
- Same computation logic with adjusted hourly rate  

---

## How It Works

1. The system displays a payroll menu.
2. Users can:
   - Add employees with attendance and overtime data.
   - View all employees.
   - Filter employees by type.
3. Salary breakdown is computed dynamically using polymorphism.
4. The program runs until the user exits.

---

## Usage

1. **Clone the repository:**
   ```bash
   git clone https://github.com/John-0-6/Employee-Payroll-System.git
