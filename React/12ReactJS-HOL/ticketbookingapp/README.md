# 12ReactJS-HOL — Ticket Booking App

## Objectives

- Explain conditional rendering in React
- Define element variables
- Explain how to prevent components from rendering
- Implement conditional rendering in React application

---

## Description

Create a React application named **ticketbookingapp** where:

- Guest user can browse the page where flight details are displayed
- Logged-in user can book tickets
- Login and Logout buttons toggle between pages
- Guest view and User view should switch accordingly

---

## Concepts Used

### 1. Conditional Rendering

Rendering UI based on condition using `if`.

### 2. Element Variables

Using variable to store JSX elements.

### 3. Prevent Rendering

Switching components based on login state.

---

## Project Structure

```
ticketbookingapp/
│
├── src/
│   ├── App.js
│   ├── GuestPage.js
│   ├── UserPage.js
│   └── index.js
```

---

## Steps to Run

```bash
npx create-react-app ticketbookingapp
cd ticketbookingapp
npm install
npm start
```

---

## Implementation

### App.js

```javascript
import React, { useState } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  let content;

  if (isLoggedIn) {
    content = <UserPage onLogout={handleLogout} />;
  } else {
    content = <GuestPage onLogin={handleLogin} />;
  }

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>{content}</div>
  );
}

export default App;
```

---

### GuestPage.js

```javascript
import React from "react";

function GuestPage({ onLogin }) {
  return (
    <div>
      <h2>Please sign up.</h2>
      <button onClick={onLogin}>Login</button>
    </div>
  );
}

export default GuestPage;
```

---

### UserPage.js

```javascript
import React from "react";

function UserPage({ onLogout }) {
  return (
    <div>
      <h2>Welcome back</h2>
      <button onClick={onLogout}>Logout</button>
    </div>
  );
}

export default UserPage;
```

---

### index.js

```javascript
import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<App />);
```

---

## Application Flow

1. Application starts → Guest Page displayed
2. User clicks **Login**
3. User Page displayed → "Welcome back"
4. User clicks **Logout**
5. Back to Guest Page

---

## Output

### Guest View

```
Please sign up.

[Login]
```

---

### User View

```
Welcome back

[Logout]
```

---

## Conclusion

- Conditional rendering implemented successfully
- Element variables used
- Login/Logout functionality achieved
- Application behaves as per requirement

---
