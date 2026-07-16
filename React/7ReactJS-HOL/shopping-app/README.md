# 7ReactJS-HOL – Shopping Cart using Props

## Objective

- Define Props in React
- Explain Default Props
- Identify differences between State and Props
- Use ReactDOM.render()
- Implement a simple Online Shopping Cart using Props

---

## Theory

### What are Props?

Props (short for Properties) are used in React to pass data from one component to another.  
They are read-only and help in making components reusable.

---

### Default Props

Default Props are used to assign default values to props if no value is passed.

Example:

```javascript
Component.defaultProps = {
  name: "Guest"
};

## Difference Between State and Props
Props	State
Passed from parent	Managed inside component
Immutable (read-only)	Mutable
Used for communication	Used for data handling
 ReactDOM.render()

Used to render React components into the DOM.

ReactDOM.createRoot(document.getElementById("root")).render(<App />);

## Implementation
 Steps
Created React application named shoppingapp (prop-app)
Created components:
OnlineShopping
Cart
Created an array of items with:
Name
Price
Passed data using Props
Used .map() to loop through items
Displayed data in table format

## Project Structure
src/
 ├── components/
 │    ├── OnlineShopping.js
 │    └── Cart.js
 ├── App.js
 └── index.js


## Output
Displays heading: Items Ordered
Shows a table with Name and Price
Items displayed:
Laptop – 80000
TV – 120000
Washing Machine – 50000
Mobile – 30000
Fridge – 70000

## Conclusion
Learned Props in React
Passed data between components
Used map() to render list
Built a simple shopping cart UI
```
