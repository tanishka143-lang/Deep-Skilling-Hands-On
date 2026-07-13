# ReactJS Hands-On Lab (ReactJS-HOL)

## Objectives

## What is SPA (Single Page Application)?

A Single Page Application (SPA) is a web application that loads a single HTML page and dynamically updates content without reloading the entire page.

## What is React?

React is a JavaScript library developed by Facebook for building user interfaces, especially for single-page applications.

### Working of React:

- Uses components
- Uses Virtual DOM for faster updates
- Follows one-way data binding

---

## Difference between SPA and MPA

| Feature         | SPA    | MPA                  |
| --------------- | ------ | -------------------- |
| Page Reload     | No     | Yes                  |
| Speed           | Fast   | Slower               |
| User Experience | Smooth | Less smooth          |
| Example         | Gmail  | Traditional websites |

---

## Pros & Cons of SPA

### Pros:

- Fast loading
- Better user experience
- Reusable components

### Cons:

- SEO issues
- Initial load can be slow
- More complex development

---

## Virtual DOM

Virtual DOM is a lightweight copy of the real DOM. React updates only the changed parts instead of reloading the entire page, making applications faster.

---

## Features of React

- Component-based architecture
- Virtual DOM
- High performance
- Reusable code
- Strong community support

---

# Hands-On Implementation

## Exercise: Create React Application

Created a React app named **myfirstreact** and displaying a message.

---

## Steps Performed

1. Installed Node.js and npm

2. Created React app using:
   npx create-react-app myfirstreact

3. Navigated into project:
   cd myfirstreact

4. Opened project in VS Code

5. Modified App.js file

---

## App.js Code

function App() {
return (

<div style={{ textAlign: "center", marginTop: "20px" }}> <h1>Welcome to the first session of React</h1> </div>
);
}

export default App;

---

## Run Application

npm start

---

## Output

Application runs on:
http://localhost:3000

Displayed:
Welcome to the first session of React

---

# 📂 Folder Structure

Deep-Skilling-Hands-On
└── ReactJS-HOL
└── myfirstreact

---

# ✅ Conclusion

- Learned concepts of SPA and React
- Understood Virtual DOM and features of React
- Successfully created and executed a React application
- Displayed required output

---
