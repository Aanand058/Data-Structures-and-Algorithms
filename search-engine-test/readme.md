# Java Digital Library

A simple Java-based digital library management system that allows users to load, view, sort, search, and save a collection of books through a text-based menu interface. The library supports data persistence through serialization, and logs user interactions for auditing purposes.

---

## Features

- **Load books** from a text file (`books.txt`) or a serialized file (`library.ser`).
- **View all books** in the library.
- **Sort books** by title, author, or publication year using multiple sorting algorithms:
  - Bubble Sort (by title)
  - Insertion Sort (by author)
  - Quick Sort (by year)
- **Search books** by title, author, or publication year (case-insensitive).
- **Data persistence** via serialization to save and load library state.
- **User interaction logging** to track actions such as viewing, sorting, searching, and exiting.
- **Text-based menu** interface for easy user interaction.

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE (e.g., IntelliJ IDEA, Eclipse) or command-line setup

### Project Structure

- `src/resources/data/books.txt` – Initial data source for books.
- `src/resources/data/library.ser` – Serialized file for saved library state.
- `src/resources/data/user_interactions.log` – Logs user activity.
- Core classes:
  - `Library` — Manages book collection and operations.
  - `Book` — Represents book objects.
  - `LibraryMenu` — Handles user interaction menu.
  - `LibrarySerializer` — Manages saving/loading serialized library data.
  - `UserInteractionLogger` — Logs user actions.
  - `Main` — Program entry point.

---

## How to Use

1. **Run the `Main` class**:
   - If a serialized library file (`library.ser`) exists, it will be loaded automatically.
   - Otherwise, the library will load books from `books.txt`.

2. **Use the menu options**:
   - View all books.
   - Sort books by title, author, or publication year.
   - Search for books by keyword (title, author, or year).
   - Exit the program (which saves the library state).

3. **Check logs**:
   - All user interactions are logged in `user_interactions.log` for auditing.

---


