# 10ReactJS-HOL – JSX and Inline Styling

## Objective

- Define JSX
- Understand ECMA Script
- Explain React.createElement()
- Learn how JSX renders to DOM
- Use JavaScript expressions in JSX
- Apply inline CSS in JSX

---

## Theory

### JSX

JSX stands for JavaScript XML. It allows us to write HTML-like code inside JavaScript.

---

### ECMAScript

ECMAScript is a standard for JavaScript. ES6 introduced modern features like arrow functions, let, const, classes, etc.

---

### React.createElement()

React.createElement() is used to create React elements. JSX is a simpler way to write this.

Example:

```javascript
React.createElement("h1", null, "Hello");
```

---

### JSX Rendering

JSX is converted into React elements and rendered to DOM using ReactDOM.

---

### JavaScript Expressions in JSX

We can use JS expressions inside {} in JSX.

Example:

```javascript
<p>{2 + 3}</p>
```

---

### Inline CSS in JSX

Inline CSS is written using objects.

Example:

```javascript
<p style={{ color: "red" }}>Text</p>
```

---

## Implementation

- Created React app "officespacerentalapp"
- Displayed heading using JSX
- Displayed image using attributes
- Created an office object
- Created a list of office objects
- Used map() to loop and display data
- Applied inline CSS:
  - Rent < 60000 → Red
  - Rent ≥ 60000 → Green

---

## Project Structure

```
src/
 ├── App.js
 ├── index.js
```

---

## Output

- Displays office image
- Displays one office object
- Displays multiple office spaces
- Rent is:
  - Red if below 60000
  - Green if above 60000

## Conclusion

In this exercise, I learned how to use JSX in React to create UI elements. I understood how to display data using objects and arrays. I also learned how to apply inline CSS dynamically based on conditions. This helped me understand how React renders content dynamically using JavaScript.
