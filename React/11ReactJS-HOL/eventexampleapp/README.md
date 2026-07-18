# 11ReactJS-HOL – Event Examples App

---

## Objectives

- Explain React events
- Explain about event handlers
- Define Synthetic event
- Identify React event naming convention

---

## Theory

### React Events

React events are actions triggered when a user interacts with the application, such as clicking a button, typing in an input field, or hovering over an element.

---

### Event Handlers

Event handlers are functions that are executed when an event occurs.

Example:

```javascript
<button onClick={this.handleClick}>Click</button>
```

---

### Synthetic Event

Synthetic events are React’s wrapper around native browser events.  
They provide consistent behavior across different browsers.

Example:

```javascript
handleChange(event) {
  console.log(event.target.value);
}
```

---

### Naming Convention

React uses camelCase for naming events.

Examples:

- onClick
- onChange
- onMouseOver

---

## Implementation

### ✔ Event Handling (Counter)

- Created Increment and Decrement buttons
- Increment button invokes multiple methods:
  - Increment counter value
  - Display alert message ("Hello! Member 1")
- Decrement button decreases the counter value

---

### Say Welcome Feature

- Created a button "Say Welcome"
- On click, it invokes a function with argument "Welcome"
- Displays alert message

---

### Synthetic Event (Click Me)

- Created a button "Click Me"
- On click, displays:

```
I was clicked
```

- Used synthetic event object

---

### Currency Converter

- Created CurrencyConvertor component
- Input field accepts amount in INR
- Currency field is set to Euro
- Convert button is used (acts as submit button)
- On clicking Submit:
  - handleSubmit / handleConvert method is invoked
  - Conversion logic applied
  - Alert displays result

Example:

```
Converting to Euro Amount is 6400
```

---

## Output

- Counter increases and decreases correctly
- Multiple functions invoked on Increment
- Welcome message displayed on button click
- Synthetic event works correctly
- Currency conversion displayed using alert

---

## Conclusion

In this exercise, I learned how to implement event handling in React applications using class components.  
I understood how to use the `this` keyword, bind methods, and handle multiple functions in a single event.  
I also learned about synthetic events and how React ensures cross-browser compatibility.  
Additionally, I implemented a currency converter using event handling and form inputs, which helped me understand real-world use cases of React events.
