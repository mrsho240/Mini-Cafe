
---

# 🛒 Shop Management System

### Overview

The **Shop Management System** is designed to streamline restaurant operations by managing both **administrative tasks** and **customer orders**.
The system supports two types of users — **Admin** and **Cashier** — each with specific roles and permissions.

---

## 🔐 1. Login Screen

**Purpose:**
Allow employees to log in with a username and password to identify their access level:

* **Admin** — for managing the system and viewing reports
* **Cashier** — for handling customer orders

---

## 💵 2. Customer Order Management (Cashier)

**Purpose:**
Functions available for cashiers include:
2.1 Add or remove menu items from an order
2.2 Calculate the total price
2.3 Close the bill
2.4 Display all tables
2.5 Check if a table is full
2.6 Change table status
2.7 View all table statuses

---

## 🧾 3. Shop Administration (Admin)

**Purpose:**
Admin users can:
3.1 Add, delete, or edit menu items
3.2 View the shop’s total daily revenue

---

## 🔄 System Workflow (Flow Chart Description)

### 1. Start

The system starts and prompts employees or administrators to log in.
The process begins with verifying the employee ID or password.

### 2. Employee Login

The employee enters their ID or password.
The system checks whether the user is an **Admin** or a **Cashier**.

### 3. Admin Verification

The system determines the user’s role:

* If **Admin = True**, proceed to **“Display Revenue and Manage Menu.”**
* If **Admin = False**, proceed to **“Check Available Tables.”**

### 4. Display Revenue and Manage Menu (Admin Only)

If the user is an **Admin**, the system displays a page where the admin can:

* View the shop’s **total daily revenue**
* **Add**, **remove**, or **edit** menu items (e.g., adjust prices)
* View **daily sales reports**
  After completing these tasks, the system returns to the main control point and ends the session.

### 5. Check Available Tables (Cashier Only)

If the user is a **Cashier**, the system checks whether there are available tables for new customers.

* If **tables available = True**, proceed to **“Customer Information.”**
* If **tables available = False**, go to **“Table Full Message.”**

### 6. Table Full Message

If there are no available tables, the system notifies the user:

> “All tables are full. No new customers can be accepted.”
> Then the system returns to the main control point before ending the process.

### 7. Customer Information

When a table is available, the system records customer details such as:

* Table number
* Ordered menu items
  This data is then used in the next step, **“Receipt.”**

### 8. Receipt

After taking the order and receiving payment, the system generates a **receipt** showing the total price.
The cashier can review it before confirming.
The system then saves the transaction and proceeds to the end of the process.

### 9. End

The process ends after all actions are completed — either by the **Admin** (system management) or the **Cashier** (order processing).

---

