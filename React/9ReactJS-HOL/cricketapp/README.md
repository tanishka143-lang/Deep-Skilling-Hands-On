# 9ReactJS-HOL – ES6 Features in React

## Objective

- List features of ES6
- Explain let, var, const
- Understand ES6 classes and inheritance
- Learn arrow functions
- Use map(), filter()
- Implement destructuring and merge

---

## Theory

### ES6 Features

ES6 introduced many new features like let, const, arrow functions, classes, destructuring, spread operator and more.

---

### let vs var

| var               | let                  |
| ----------------- | -------------------- |
| Function scoped   | Block scoped         |
| Can be redeclared | Cannot be redeclared |

---

### const

const is used to declare constant variables which cannot be reassigned.

---

### Arrow Functions

Arrow functions provide shorter syntax for writing functions.

Example:

```javascript
const add = (a, b) => a + b;
```

---

### map()

Used to iterate over array and return new array.

---

### filter()

Used to filter elements based on condition.

---

### Destructuring

Used to extract values from arrays or objects.

---

## Implementation

- Created React app "cricketapp"
- Created components:
  - ListofPlayers
  - IndianPlayers
- Used map() to display players
- Used filter() to show players with score < 70
- Used destructuring to split players into odd and even teams
- Used spread operator to merge arrays
- Used flag variable to display components conditionally

---

## Project Structure

```
src/
 ├── components/
 │    ├── ListofPlayers.js
 │    └── IndianPlayers.js
 ├── App.js
 └── index.js
```

---

## Output

- When flag = true:
  - Displays all players
  - Displays players with score less than 70

- When flag = false:
  - Displays odd team players
  - Displays even team players
  - Displays merged players

---

---

## Conclusion (In My Words)

In this exercise, I learned how to use ES6 features in React like map(), filter(), arrow functions, destructuring and spread operator. I also understood how to conditionally render components using a flag variable. This helped me improve my understanding of modern JavaScript concepts inside React applications.
