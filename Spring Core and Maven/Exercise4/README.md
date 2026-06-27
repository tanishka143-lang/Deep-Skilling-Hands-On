# Exercise 4: Creating and Configuring a Maven Project

##  Objective

The objective of this exercise is to create a Maven project and configure it by adding necessary Spring Framework dependencies and plugins.

---

## Tools and Technologies Used

* Java (JDK 8 or above)
* Apache Maven
* IntelliJ IDEA
* Spring Framework

---

##  Project Structure

Exercise4/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        └── resources/

---

## ️ Steps Performed

### 1. Created Maven Project

* A new folder named **Exercise4** was created.
* Standard Maven directory structure was set up manually.

### 2. Added Dependencies in pom.xml

The following Spring dependencies were added:

* Spring Context
* Spring AOP
* Spring Web MVC

These dependencies help in building Spring-based applications with core features, aspect-oriented programming, and web capabilities.

### 3. Configured Maven Compiler Plugin

The Maven Compiler Plugin was configured to use:

* Java Source Version: 1.8
* Java Target Version: 1.8

This ensures compatibility with Java 8 features.

---

##  pom.xml Configuration Highlights

* Defined groupId, artifactId, and version
* Added Spring dependencies
* Configured Maven Compiler Plugin

---

##  Output / Result

* Maven project was successfully created.
* Dependencies were resolved and downloaded.
* No errors were observed in the pom.xml file.
* Project is ready for further Spring development.

---


## Conclusion

This exercise successfully demonstrated how to:

* Create a Maven project manually
* Add required dependencies
* Configure build plugins

The project is now ready for building Spring-based applications.
