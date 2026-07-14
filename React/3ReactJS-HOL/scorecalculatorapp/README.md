# ReactJS Hands-On Lab – Student Management Portal

---

## Objectives

### 1. Explain React Components

React components are reusable building blocks of a user interface. They help break the UI into independent and manageable parts.

---

### 2. Difference Between Components and JavaScript Functions

- JavaScript functions return values.
- React components return JSX (UI elements).
- Components can handle UI rendering and state.

---

### 3. Types of Components

- Class Components
- Functional Components

---

### 4. Explain Class Component

Class components are ES6 classes that extend `React.Component`. They use lifecycle methods and a `render()` function to display UI.

---

### 5. Explain Function Component

Function components are simple JavaScript functions that return JSX. They are easy to write and widely used in modern React.

---

### 6. Define Component Constructor

The constructor is used in class components to initialize state and bind methods.

---

### 7. Define render() Function

The `render()` function returns JSX and is used in class components to display UI.

---

# Implementation of hands-on

## Project Name

**scorecalculatorapp**

---

## Description

This project is a **Student Management Portal** that calculates and displays the average score (percentage) of a student using a React functional component.

---

## Steps Performed

1. Created React project using Vite
2. Installed dependencies using npm
3. Created folder **Components** inside `src`
4. Created functional component **CalculateScore.jsx**
5. Created folder **Stylesheets**
6. Added CSS file **mystyle.css**
7. Used props to pass:
   - Name
   - School
   - Total Marks
   - Goal (number of subjects)

8. Implemented logic to calculate percentage
9. Displayed output using JSX
10. Applied styling using CSS
11. Rendered component inside `App.jsx`
12. Ran application using `npm run dev`

---

## Code Highlights

### Functional Component

Uses a function component to display student details.

### Props Usage

Props are used to pass data from parent (`App.jsx`) to child (`CalculateScore.jsx`).

### Calculation Logic

Percentage is calculated using:

```js
total / goal;
```

### Styling

CSS is applied using external stylesheet (`mystyle.css`).

---

## Result

The React application successfully:

- Created a functional component
- Used props to pass data
- Calculated student score
- Displayed output in browser

---

## Conclusion

This hands-on helped in understanding:

- React functional components
- Props usage
- JSX rendering
- Component-based architecture
- Styling in React

---
