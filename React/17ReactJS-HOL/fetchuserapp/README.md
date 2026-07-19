# 17ReactJS-HOL – Fetch User App

---

## Objectives

### 1. Explain how to consume REST APIs from React applications

Consuming REST APIs in React means fetching data from a backend server using HTTP requests. This is commonly done using:

- `fetch()` API
- `axios` library

React fetches data inside lifecycle methods (Class Components) or hooks like `useEffect` (Functional Components).

---

### 2. Construct a React application that invokes REST API and fetches data

A React app can call APIs using:

```
fetch("API_URL")
  .then(res => res.json())
  .then(data => setState(data));
```

The fetched data is stored in state and displayed in UI.

---

## Problem Statement

Create a React application named **fetchuserapp** which retrieves user details from:

https://api.randomuser.me/

### Requirements

- Create component: **Getuser**
- Fetch API data using `fetch()`
- Use lifecycle method: `componentDidMount()`
- Display:
  - Title
  - First Name
  - User Image

Source: :contentReference[oaicite:0]{index=0}

---

## Technologies Used

- React JS
- JavaScript (ES6)
- HTML5
- CSS
- REST API

---

## Project Structure

```
fetchuserapp/
│
├── src/
│   ├── App.js
│   ├── Getuser.js
│   ├── index.js
│
├── package.json
└── README.md
```

---

## Steps to Run

```
npx create-react-app fetchuserapp
cd fetchuserapp
npm install
npm start
```

---

## Source Code

---

### Getuser.js

```
import React, { Component } from "react";

class Getuser extends Component {
  constructor() {
    super();
    this.state = {
      user: null
    };
  }

  componentDidMount() {
    fetch("https://api.randomuser.me/")
      .then(response => response.json())
      .then(data => {
        this.setState({ user: data.results[0] });
      });
  }

  render() {
    if (!this.state.user) {
      return <h2>Loading...</h2>;
    }

    return (
      <div style={{ margin: "50px" }}>
        <h1>
          {this.state.user.name.title} {this.state.user.name.first} {this.state.user.name.last}
        </h1>

        <img src={this.state.user.picture.large} alt="User" />
      </div>
    );
  }
}

export default Getuser;
```

---

### App.js

```
import React from "react";
import Getuser from "./Getuser";

function App() {
  return (
    <div>
      <Getuser />
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

---

## Sample Output

Example:

```
Mr Donato Nunes
[User Image]
```

---

## Concepts Used

### 1. Lifecycle Method

```
componentDidMount()
```

- Runs after component loads
- Used for API calls

---

### 2. Fetch API

```
fetch("https://api.randomuser.me/")
```

---

### 3. State Management

```
this.state = { user: null }
```

---

### 4. Conditional Rendering

```
if (!this.state.user) return <h2>Loading...</h2>;
```

---

## Common Errors & Fixes

### Data not showing

Check:

```
data.results[0]
```

---

### Image not loading

Use correct path:

```
user.picture.large
```

---

### Blank screen

Add loading condition

---

## Key Points

- Used Class Component
- Used `componentDidMount()`
- Consumed REST API
- Displayed dynamic data

---

## Status

✔ Completed successfully  
✔ Output matches expected  
✔ API working correctly

---

## Learning Outcome

- Learned API integration in React
- Understood lifecycle methods
- Displayed dynamic API data

---

## Conclusion

This project demonstrates:

- REST API Consumption
- React Lifecycle Methods
- Dynamic UI Rendering

---
