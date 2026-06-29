# Exercise 7: Constructor and Setter Injection

##  Objective

To implement constructor and setter injection using Spring Framework.

---

##  Technologies Used

* Java
* Spring Core
* Maven

---

##  Project Structure

* BookRepository → returns book data
* BookService → uses repository
* applicationContext.xml → bean configuration
* Main class → runs application

---

## ️ Implementation

### Constructor Injection

Configured using:

```xml
<constructor-arg ref="bookRepository"/>
```

### Setter Injection

Configured using:

```xml
<property name="bookRepository" ref="bookRepository"/>
```

---

## ️ Execution

Run `LibraryManagementApplication.java`

---

##  Output

Book: Spring Framework in Action
Book: Spring Framework in Action

---

##  Concepts Learned

* Dependency Injection
* Constructor Injection
* Setter Injection
* Spring IoC Container
