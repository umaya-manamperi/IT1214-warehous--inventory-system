## Project Description

The Warehouse Inventory Management System is a simple Java-based application developed to manage items in a warehouse efficiently. This system allows users to add, remove, update, search, and display items using a console-based interface.

The application is developed using the Java Collections Framework, specifically HashMap, to store and manage item data using key-value pairs. Each item contains details such as item ID, name, quantity, and price.

This project demonstrates Object-Oriented Programming (OOP) concepts such as encapsulation, class design, and method implementation. It also shows how real-world problems like inventory management can be solved using Java programming.

The system is user-friendly and handles invalid inputs gracefully, making it reliable for basic warehouse operations.

## How to Run the Program

1. Make sure Java is installed on your computer.

2. Download or clone this repository.

3. Open the project folder using a terminal or command prompt.

4. Compile all Java files:
   javac *.java

5. Run the main class:
   java Warehouse

6. Follow the menu instructions displayed in the console.

## Sample Output

--- Warehouse Menu ---
1. Add Item
2. Remove Item
3. Update Quantity
4. Search by ID
5. Search by Name
6. Display All
0. Exit

Enter choice: 1
Enter ID: I001
Enter Name: Pen
Enter Quantity: 10
Enter Price: 20.5
Item added successfully!

Enter choice: 1
Enter ID: I002
Enter Name: Book
Enter Quantity: 5
Enter Price: 150.0
Item added successfully!

Enter choice: 6
I001 | Pen | Qty: 10 | Price: 20.5
I002 | Book | Qty: 5 | Price: 150.0

Enter choice: 4
Enter ID: I001
I001 | Pen | Qty: 10 | Price: 20.5

Enter choice: 3
Enter ID: I001
Enter New Quantity: 20
Quantity updated!

Enter choice: 6
I001 | Pen | Qty: 20 | Price: 20.5
I002 | Book | Qty: 5 | Price: 150.0

Enter choice: 2
Enter ID: I002
Item removed!

Enter choice: 6
I001 | Pen | Qty: 20 | Price: 20.5

Enter choice: 0
Exiting...
