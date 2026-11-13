# Lab Task 07 – Construction for Reuse: Interfaces, Generics, and Contracts

**University of Engineering and Technology, Abbottabad Campus**
**Course:** Software Construction | **Class:** 5th Semester Software Engineering
**Instructor:** Engr. Rizwan Shah | **Date:** 27 Oct 2026
**Student:** Muhammad Awais (24ABSWE0013)

## Objective
Design components capable of black-box reuse, generic type safety, and contract integrity.

## Repository Structure
```
Task1_BlackBoxReuse/   PaymentMethod, CreditCardPayment, JazzCashPayment, EcommerceCart, Main
Task2_Generics/        DataBox<T>, Main (+ CompileErrorDemo.java.txt)
Task3_LSP/violation/   Rectangle, Square (breaks LSP), Client (crashes)
Task3_LSP/fixed/       Shape interface, Rectangle, Square, Client (fixed)
Task4_Ordering/        Student (Comparable), CgpaComparator, Main   [Homework]
```

## Task Descriptions
1. **Black-Box Reuse (Composition via Interfaces):** `EcommerceCart` receives a `PaymentMethod` through its constructor (dependency injection) and processes payments without knowing whether it is `CreditCardPayment` or `JazzCashPayment`, avoiding the fragile base class problem.
2. **Generic `DataBox<T>`:** A type-safe container with a private field, constructor and getter. `DataBox<String>` holds a student name, `DataBox<Integer>` holds a student ID; storing a `String` in the `Integer` box is a compile-time error.
3. **Liskov Substitution Principle:** `Square extends Rectangle` throws an exception for `w != h`, strengthening the precondition, so `setDimensions(5, 10)` crashes when a `Square` is used as a `Rectangle`. Fixed by removing the inheritance and introducing a common `Shape` interface.
4. **Reusable Ordering Algorithms (Homework):** `Student` implements `Comparable<Student>` (rollNo ascending); `CgpaComparator` implements `Comparator<Student>` (cgpa descending).

## How to Run
Requires JDK 11+. From the repository root:

```bash
# Task 1
cd Task1_BlackBoxReuse && javac *.java && java Main && cd ..

# Task 2
cd Task2_Generics && javac DataBox.java Main.java && java Main && cd ..

# Task 3 – violation (crashes on purpose)
cd Task3_LSP/violation && javac *.java && java Client && cd ../..

# Task 3 – fixed
cd Task3_LSP/fixed && javac *.java && java Client && cd ../..

# Task 4
cd Task4_Ordering && javac *.java && java Main && cd ..
```
To see the compile-time safety error for Task 2, rename `CompileErrorDemo.java.txt` to `CompileErrorDemo.java` and run `javac DataBox.java CompileErrorDemo.java`.
