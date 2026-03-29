[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)

# PCCC S495 - Term II Project: Library Management System

## Project Title
OOP-Based Library Management System

## Problem Statement
Traditional library logging is prone to errors and data inconsistency. This project provides a structured, Graphical User Interface (GUI) to manage book inventories using robust Object-Oriented principles to ensure data integrity and ease of use.

## Target User
Library administrators and students looking for a lightweight, modular inventory management tool.

## Core Features
- **Dynamic Inventory Table:** View all added books in real-time.
- **Input Validation:** Prevents empty or incorrect data from being saved.
- **OOP Structure:** Modular code design for easy future updates (like database integration).

## OOP Concepts Used
- **Abstraction:** Used an abstract class `LibraryItem` to define a blueprint for library objects.
- **Inheritance:** The `Book` class inherits core attributes from `LibraryItem`.
- **Encapsulation:** Private data fields with public getters and setters to protect data.
- **Polymorphism:** Method overriding for specific item descriptions.

## Proposed Architecture Description
The system is divided into three layers:
1. **Model Layer (`LibraryItem`):** Defines the data structure.
2. **Logic Layer (`Book`):** Handles specific object behavior.
3. **View Layer (`LibraryGUI`):** Manages the Swing-based User Interface.

## How to Run
1. Download the repository and extract the ZIP.
2. Open Terminal/CMD in the project folder.
3. Compile: `javac src/*.java`
4. Run: `java src.LibraryGUI`
