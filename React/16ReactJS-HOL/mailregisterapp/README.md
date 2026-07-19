# 16ReactJS-HOL – Mail Registration App
---

## Objectives

- Explain React Forms validation
- Identify differences between React Form and HTML Form
- Explain controlled components
- Identify various React Form input controls
- Explain how to handle React Forms
- Explain about submitting forms in React

### 1. Explain React Forms Validation

React form validation is the process of checking user input before submitting the form. It ensures that the data entered is correct and follows required rules (like length, format, etc.). In React, validation is done using JavaScript logic inside event handlers like `onSubmit`.

---

### 2. Identify Differences Between React Form and HTML Form

| Feature       | HTML Form       | React Form                         |
| ------------- | --------------- | ---------------------------------- |
| Data Handling | Uses DOM        | Uses React State                   |
| Control       | Uncontrolled    | Controlled                         |
| Validation    | HTML attributes | JavaScript logic                   |
| Page Reload   | Yes             | Prevented using `preventDefault()` |

---

### 3. Explain Controlled Components

Controlled components are form elements whose values are controlled by React state using `useState`. The input field value is always synced with the state.

Example:

```
const [name, setName] = useState("");
<input value={name} onChange={(e) => setName(e.target.value)} />
```

---

### 4. Identify Various React Form Input Controls

Common input controls used in React forms:

- Textbox (`input type="text"`)
- Password (`input type="password"`)
- Textarea (`textarea`)
- Button (`button`)
- Checkbox / Radio buttons

---

### 5. Explain How to Handle React Forms

React forms are handled using:

- `useState` → to store form data
- `onChange` → to update values
- `onSubmit` → to process form

Steps:

1. Create state variables
2. Bind inputs using `value`
3. Update using `onChange`
4. Handle submit using `onSubmit`

---

### 6. Explain Submitting Forms in React

Form submission is handled using `onSubmit` event. The default page reload is prevented using:

```
event.preventDefault();
```

Then validation logic is applied and appropriate action is taken (like alert or API call).

## Problem Statement

Create a React application named **mailregisterapp** with a component **register.js**.

The form should accept:

- Name
- Email
- Password

### Validation Rules

1. Name must be at least 5 characters
2. Email must contain `@` and `.`
3. Password must be at least 8 characters

### Important Requirement

- Validation must be implemented using:
  - `onChange` (event handling)
  - `onSubmit` (form submission)

---

## Technologies Used

- React JS
- JavaScript (ES6)
- HTML5
- CSS

---

## Project Structure

```
mailregisterapp/
│
├── src/
│   ├── App.js
│   ├── register.js
│   ├── index.js
│
├── package.json
└── README.md
```

---

## Steps to Run

```
npx create-react-app mailregisterapp
cd mailregisterapp
npm install
npm start
```

---

## Source Code

### register.js

```
import React, { useState } from "react";

function Register() {

  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    if (name.length < 5) {
      alert("Full Name must be 5 characters long!");
      return;
    }

    if (!email.includes("@") || !email.includes(".")) {
      alert("Email is not valid!");
      return;
    }

    if (password.length < 8) {
      alert("Password must be 8 characters long!");
      return;
    }

    alert("Registration Successful!");
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1 style={{ color: "red" }}>Register Here!!!</h1>

      <form onSubmit={handleSubmit}>

        <div>
          Name:
          <input
            type="text"
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
        </div>

        <div>
          Email:
          <input
            type="text"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>

        <div>
          Password:
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>

        <button type="submit">Submit</button>

      </form>
    </div>
  );
}

export default Register;
```

---

### App.js

```
import React from "react";
import Register from "./register";

function App() {
  return (
    <div>
      <Register />
    </div>
  );
}

export default App;
```

---

### index.js

```
import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<App />);
```

## Validation Messages

### Invalid Name

```
Full Name must be 5 characters long!
```

### Invalid Email

```
Email is not valid!
```

### Invalid Password

```
Password must be 8 characters long!
```

### Successful Submission

```
Registration Successful!
```

---

## Sample Test Cases

| Name  | Email          | Password | Output         |
| ----- | -------------- | -------- | -------------- |
| abc   | test@gmail.com | 12345678 | Name Error     |
| abcde | testgmail.com  | 12345678 | Email Error    |
| abcde | test@gmail.com | 1234     | Password Error |
| abcde | test@gmail.com | 12345678 | Success        |

---

## Concepts Used

### Controlled Components

- Form inputs are controlled using React state

### useState Hook

- Used to store input values

### Event Handling

- `onChange` → update state
- `onSubmit` → validate form

### Prevent Page Reload

```
e.preventDefault();
```

---

## Difference: HTML Form vs React Form

| Feature       | HTML Form    | React Form |
| ------------- | ------------ | ---------- |
| Data Handling | DOM          | State      |
| Control       | Uncontrolled | Controlled |
| Validation    | HTML         | JavaScript |
| Page Reload   | Yes          | No         |

---

## Common Errors & Fixes

### Page Refresh Issue

```
e.preventDefault();
```

### Input Not Updating

- Ensure `onChange` is used

### Validation Not Working

- Check conditions in `handleSubmit`

---

## Key Points

- Used React Hooks (`useState`)
- Implemented form validation
- Used controlled components
- Followed all PDF requirements

---

## Status

✔ Completed successfully  
✔ Output matches expected result  
✔ All validations working

---

## Learning Outcome

After completing this exercise, you can:

- Build React forms
- Perform validation
- Handle user input
- Use controlled components

---

## Conclusion

This project demonstrates:

- React Form Validation
- Event Handling
- Controlled Components
- Real-world Registration Form

---
