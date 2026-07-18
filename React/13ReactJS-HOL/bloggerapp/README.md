# 13ReactJS-HOL — Blogger App

## Objectives

- Explain various ways of conditional rendering
- Explain how to render multiple components
- Define list component
- Explain keys in React applications
- Explain extracting components with keys
- Explain React map() function :contentReference[oaicite:0]{index=0}

---

## Prerequisites

- Node.js
- NPM
- Visual Studio Code

---

## Description

Create a React App named **bloggerapp** with 3 components:

1. Course Details
2. Book Details
3. Blog Details

Implement rendering using **multiple conditional rendering techniques**.

---

## Project Structure

```
bloggerapp/
│
├── src/
│   ├── App.js
│   ├── CourseDetails.js
│   ├── BookDetails.js
│   ├── BlogDetails.js
│   └── index.js
```

---

## Steps to Run

```bash
npx create-react-app bloggerapp
cd bloggerapp
npm install
npm start
```

---

## Implementation

### App.js

```javascript
import React from "react";
import CourseDetails from "./CourseDetails";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";

function App() {
  // Method 1: Element Variable
  let showComponents = true;

  // Method 2: Ternary Operator
  return (
    <div
      style={{
        display: "flex",
        justifyContent: "space-around",
        marginTop: "50px",
      }}
    >
      {showComponents ? <CourseDetails /> : null}

      {/* Method 3: Logical && */}
      {showComponents && <BookDetails />}

      {/* Method 4: Direct Rendering */}
      <BlogDetails />
    </div>
  );
}

export default App;
```

---

### CourseDetails.js

```javascript
import React from "react";

function CourseDetails() {
  const courses = [
    { id: 1, name: "Angular", date: "4/5/2021" },
    { id: 2, name: "React", date: "6/3/2020" },
  ];

  return (
    <div>
      <h2>Course Details</h2>

      {courses.map((course) => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
```

---

### BookDetails.js

```javascript
import React from "react";

function BookDetails() {
  const books = [
    { id: 1, name: "Master React", price: 670 },
    { id: 2, name: "Deep Dive into Angular 11", price: 800 },
    { id: 3, name: "Mongo Essentials", price: 450 },
  ];

  return (
    <div>
      <h2>Book Details</h2>

      {books.map((book) => (
        <div key={book.id}>
          <h4>{book.name}</h4>
          <p>{book.price}</p>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
```

---

### BlogDetails.js

```javascript
import React from "react";

function BlogDetails() {
  const blogs = [
    {
      id: 1,
      title: "React Learning",
      author: "Stephen Biz",
      content: "Welcome to learning React!",
    },
    {
      id: 2,
      title: "Installation",
      author: "Schwezdiener",
      content: "You can install React from npm.",
    },
  ];

  return (
    <div>
      <h2>Blog Details</h2>

      {blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <p>{blog.author}</p>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
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

## Concepts Implemented

### Conditional Rendering Methods Used

1. Element Variable → `let showComponents`
2. Ternary Operator → `condition ? component : null`
3. Logical AND → `condition && component`
4. Direct Rendering

---

### List Rendering

- Used `map()` function to render lists
- Each element has a unique `key`

---

### Keys in React

- Keys help React identify elements efficiently
- Used `id` as key

---

### Extract Components

- Created separate components:
  - CourseDetails
  - BookDetails
  - BlogDetails

---

---

## Conclusion

- Successfully rendered multiple components
- Implemented different conditional rendering techniques
- Used list rendering with map()
- Applied keys for efficient rendering
- Extracted reusable components

---
