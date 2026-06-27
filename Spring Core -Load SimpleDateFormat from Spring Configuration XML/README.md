# Spring Core – Load SimpleDateFormat from Spring Configuration XML

##  Objective

In this exercise, I learned how to avoid creating objects multiple times in an application by defining them as beans in Spring XML configuration.

Here, I created a `SimpleDateFormat` bean using Spring and used it in my Java application.

---

## ️ Technologies Used

* Java
* Spring Core
* Maven
* IntelliJ IDEA

---

##  Project Structure

* `src/main/java` → Java source files
* `src/main/resources` → XML configuration file
* `pom.xml` → Maven dependencies

---

## ️ Steps I Followed

1. Created a Maven project using command prompt
2. Added Spring dependency in `pom.xml`
3. Created `date-format.xml` inside `src/main/resources`
4. Defined a bean for `SimpleDateFormat` with pattern `dd/MM/yyyy`
5. Loaded the Spring context using `ClassPathXmlApplicationContext`
6. Retrieved the bean using `getBean()`
7. Parsed the date `"31/12/2018"` and printed the output

---

## XML Configuration

```xml
<bean id="dateFormat" class="java.text.SimpleDateFormat">
    <constructor-arg value="dd/MM/yyyy" />
</bean>
```

---

##  Java Code (Main Logic)

```java
ApplicationContext context =
    new ClassPathXmlApplicationContext("date-format.xml");

SimpleDateFormat format =
    context.getBean("dateFormat", SimpleDateFormat.class);

Date date = format.parse("31/12/2018");
System.out.println(date);
```

---

## ️ Output

```
Mon Dec 31 00:00:00 IST 2018
```

---


##  What I Learned

* How to use Spring XML configuration
* How to define and use beans
* Dependency injection basics
* Avoiding object creation in multiple places

---

##  Conclusion

This exercise helped me understand how Spring manages objects using beans and how it improves code reusability and maintainability.
