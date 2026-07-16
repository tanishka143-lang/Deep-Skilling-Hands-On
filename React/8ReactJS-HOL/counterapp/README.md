# 8ReactJS-HOL – Counter App using React State

## Objective

- Explain React State
- Use React State object
- Implement a simple counter application using State

---

## Theory

### What is State in React?

State is an object in React used to store data that can change over time.  
It is managed within the component and allows dynamic updates in the UI.

---

### Why use State?

- To store dynamic data
- To update UI automatically when data changes
- To manage user interactions

---

### Constructor in Class Component

The constructor is used to initialize the state of a class component.

```javascript
constructor() {
  super();
  this.state = {
    entrycount: 0,
    exitcount: 0
  };
}
```

---

### setState()

setState() is used to update the state and re-render the component.

```javascript
this.setState({
  entrycount: this.state.entrycount + 1,
});
```

---

## Implementation

### Steps

1. Created React app named **counterapp**
2. Created a class component **CountPeople**
3. Initialized state using constructor:
   - entrycount
   - exitcount
4. Created methods:
   - UpdateEntry() → increments entry count
   - UpdateExit() → increments exit count
5. Added two buttons:
   - Login
   - Exit
6. Displayed updated values on UI

---

## Project Structure

```
src/
 ├── components/
 │    └── CountPeople.js
 ├── App.js
 └── index.js
```

---

---

## Output

- Displays heading: **Mall Entry Counter**
- Shows:
  - People Entered count
  - People Exited count
- Buttons:
  - Login → increases entry count
  - Exit → increases exit count

---

---

## Conclusion

- Learned how to use React State
- Implemented class component with constructor
- Updated UI dynamically using setState()
- Built a simple counter application

---
