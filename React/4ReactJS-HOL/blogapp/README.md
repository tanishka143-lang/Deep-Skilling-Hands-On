# Blog App (ReactJS HOL)

## Objective Questions

### 1. What is a Class Component?

A Class Component is a JavaScript class that extends `React.Component` and uses a `render()` method to display UI.

### 2. What is componentDidMount()?

It is a lifecycle method that runs after the component is rendered and is mainly used for API calls.

### 3. What is State in React?

State is an object used to store dynamic data in a component.

### 4. What is Fetch API?

Fetch API is used to get data from a server using HTTP requests.

### 5. Why use key in React lists?

It helps React identify elements uniquely and improves performance.

---

## Implementation

### Project Structure

blogapp/
│── src/
│ ├── App.js
│ ├── Posts.js
│ ├── index.js
│── public/
│── package.json

---

### Posts.js

```jsx
import React, { Component } from "react";

class Posts extends Component {
  constructor() {
    super();
    this.state = {
      posts: [],
    };
  }

  componentDidMount() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => this.setState({ posts: data }));
  }

  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.slice(0, 10).map((post) => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
```
