# 14ReactJS-HOL — React Context API

## Objectives

- Explain need and benefits of React Context API
- Work with createContext()
- Understand Provider and Consumer
- Avoid props drilling

---

## Description

Converted application from props-based data passing to Context API for theme management.

---

## Concepts Used

### 1. React Context API

Used to share data globally.

### 2. createContext()

Created ThemeContext with default value "light".

### 3. Provider

Wrapped App component with ThemeContext.Provider.

### 4. useContext()

Accessed theme in EmployeeCard.

---

## Project Structure

```
src/
 ├── App.js
 ├── ThemeContext.js
 ├── EmployeeList.js
 ├── EmployeeCard.js
 └── index.css
```

---

## How to Run

```bash
npm install
npm start
```

---

## Flow

1. Theme stored in App state
2. Passed using Context Provider
3. Accessed using useContext()
4. Button style changes dynamically

---

## Conclusion

- Eliminated props drilling
- Implemented Context API successfully
- Applied dynamic theming

---
