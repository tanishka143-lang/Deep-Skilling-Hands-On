# 15ReactJS-HOL – Ticket Raising App

---

## Objectives

- Explain about React forms
- Define controlled components
- Explain about various input controls
- Explain about handling forms
- Explain about submitting forms

---

## Problem Statement

Create a React App named **ticketraisingapp** which will:

- Allow user to enter employee name
- Allow user to enter complaint using textarea
- Submit the complaint
- Generate a reference (transaction) number
- Display confirmation using alert

---

## Technologies Used

- React JS
- JavaScript (ES6)
- HTML5
- CSS

---

## Project Structure

ticketraisingapp/
│
├── src/
│ ├── App.js
│ ├── ComplaintRegister.js
│ ├── index.js
│
├── package.json
└── README.md

---

## Features

- Controlled input fields using React state
- Textbox for employee name
- Textarea for complaint
- Submit button with event handling
- Random Transaction ID generation
- Alert message display
- Form reset after submission

---

## Concepts Used

### Controlled Components

Form elements are controlled using React state.

### useState Hook

Used to store:

- Employee name
- Complaint

### Event Handling

- `onChange` → Updates state
- `onSubmit` → Handles form submission

### Prevent Default Behavior

event.preventDefault();

### Random Number Generation

Math.floor(Math.random() \* 100);

---

## Implementation Details

### Component: ComplaintRegister

- Uses two state variables:
  - name
  - complaint

- On submit:
  - Prevents page reload
  - Generates random ID
  - Displays alert
  - Clears form

---

---

### Alert Output

Thanks <Name>
Your Complaint was Submitted.
Transaction ID is: <Random Number>

---

## Example Output

Thanks Shrivalli
Your Complaint was Submitted.
Transaction ID is: 83

---

## Sample Test Case

| Input Name | Complaint            | Output        |
| ---------- | -------------------- | ------------- |
| Shrivalli  | Keyboard not working | Alert with ID |

---

## Key Points

- Used React Hooks
- Implemented controlled components
- Handled form submission
- Generated dynamic alert

---

## Common Errors

### Page refresh on submit

Fix:

event.preventDefault();

### Input not updating

Fix:
Check `onChange` function

### Alert not showing

Fix:
Ensure button type is `submit`

---

## Status

✔ Completed successfully  
✔ Matches expected output  
✔ Follows Cognizant Hands-on Lab

---

## Learning Outcome

After this exercise, you can:

- Create React forms
- Handle user input
- Use controlled components
- Manage form submission
- Generate dynamic UI output

---

## Conclusion

This project demonstrates:

- Form handling in React
- Controlled components usage
- Event-driven programming
- Real-world complaint registration system
