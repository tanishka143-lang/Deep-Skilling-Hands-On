# 5ReactJS-HOL – Styling React Components

## Objective

- Understand the need for styling React components
- Work with CSS Modules and inline styles
- Apply styles using className and style properties

---

## Tools & Prerequisites

- Node.js
- npm
- Visual Studio Code

---

## Project Structure

5ReactJS-HOL/
└── cohort-dashboard/
├── src/
│ ├── App.js
│ ├── CohortDetails.js
│ ├── CohortDetails.module.css
│ └── index.js

---

## Implementation Steps

1. Created a React application using `create-react-app`
2. Installed dependencies using `npm install`
3. Created a component `CohortDetails.js`
4. Created a CSS Module file `CohortDetails.module.css`
5. Defined styling for `.box` class:
   - Width: 300px
   - Display: inline-block
   - Margin: 10px
   - Padding: 10px 20px
   - Border: 1px solid black
   - Border-radius: 10px

6. Styled `<dt>` tag using:
   - `font-weight: 500`

7. Imported CSS Module into component
8. Applied styles using `className`
9. Implemented conditional styling:
   - Green color → when status is **ongoing**
   - Blue color → otherwise

---
