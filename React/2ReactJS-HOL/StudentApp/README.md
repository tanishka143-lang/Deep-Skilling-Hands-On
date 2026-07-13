# ReactJS Hands-On Lab 2 – Student Management Portal

## Objectives-

## What are React Components?

React components are small reusable pieces of code that define how a part of the UI looks.
Instead of writing everything in one file, we divide the UI into components.

---

## Components vs JavaScript Functions

- A JavaScript function is used for general logic
- A React component is used to display UI

## Types of Components

There are mainly two types:

### 1. Class Components

- Written using ES6 classes
- Use `render()` method
- Can manage state

### 2. Function Components

- Simple JavaScript functions
- Easier and modern way
- Return JSX directly

---

## What is Constructor?

Constructor is a special method used to initialize values (like state) when a component is created.

---

## What is render()?

- It is a required method in class components
- It returns the UI (JSX) to display on the screen

---

# Hands-On Implementation

## Problem Statement

I created a **Student Management Portal** with three components:

- Home
- About
- Contact

Each component displays a welcome message.

---

## 🛠 Steps I Followed

### Step 1: Created React App

```bash
npx create-react-app studentapp
```

Then renamed it to:

```text
StudentApp
```

---

### Step 2: Created Components Folder

Inside `src`, I created a folder named:

```text
Components
```

---

### Step 3: Created Component Files

Inside Components folder:

```text
Home.js
About.js
Contact.js
```

---

### Step 4: Wrote Code for Components

Each component is a **class component**.

Example (Home.js):

```js
import React, { Component } from "react";

class Home extends Component {
  render() {
    return <h1>Welcome to the Home page of Student Management Portal</h1>;
  }
}

export default Home;
```

I created similar code for:

- About.js
- Contact.js

---

### Step 5: Updated App.js

I imported all components and displayed them:

```js
import Home from "./Components/Home";
import About from "./Components/About";
import Contact from "./Components/Contact";

function App() {
  return (
    <div style={{ textAlign: "center" }}>
      <Home />
      <About />
      <Contact />
    </div>
  );
}
```

---

### Step 6: Ran the Application

```bash
npm start
```

---

# Output

On running the application in browser:

```text
http://localhost:3000
```

I got the following output:

- Welcome to the Home page of Student Management Portal
- Welcome to the About page of the Student Management Portal
- Welcome to the Contact page of the Student Management Portal

---

# Conclusion

In this lab, I understood how React components work.
I learned how to create multiple class components and render them inside the main App component.
This helped me understand the basic structure of a React application.

---
