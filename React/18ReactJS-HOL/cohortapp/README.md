# React Hands-On Lab – Exercise 18 (Cohort Dashboard Testing)

---

## Objectives

- Explain the need for Unit Testing in React
- Work with Jest and Enzyme in React
- List the types of Router Components

---

## 1. Explain the need for Unit Testing in React

Unit Testing in React is required to verify that individual components work correctly in isolation.

### Importance:

- Detects bugs early during development
- Ensures each component behaves as expected
- Improves code quality and reliability
- Makes refactoring safer
- Reduces debugging time

In React, since applications are component-based, testing each component independently ensures the entire UI works correctly.

---

## 2. Working with Jest and Enzyme in React

### Jest

Jest is a JavaScript testing framework used to:

- Run test cases
- Perform assertions
- Generate snapshots
- Provide test reports

### Enzyme

Enzyme is a React testing utility used to:

- Render components
- Traverse and inspect DOM
- Simulate user interactions

### How they work together:

- Jest runs the test cases
- Enzyme helps test React components

### Enzyme Methods:

- `shallow()` → renders only component
- `mount()` → renders full DOM
- `find()` → finds elements
- `props()` → checks props

---

## 3. List the types of Router Components in React

React Router provides different routing components:

### Main Router Types:

- BrowserRouter
- HashRouter
- MemoryRouter

### Navigation Components:

- Route
- Routes
- Link
- NavLink

---

# Prerequisites

- Node.js
- NPM
- Visual Studio Code

---

# Problem Statement

The My Academy team at Cognizant wants to build a dashboard to display cohort details.

A React app is already developed.

Task:

- Write unit tests for the CohortDetails component
- Ensure it works correctly

---

# Implementation Steps

---

## - Install dependencies

```bash
npm install
- Install Enzyme
npm install --save-dev enzyme enzyme-adapter-react-16
- Fix dependency issue
npm install cheerio@0.22.0
- Clean install (Windows)
rd /s /q node_modules
del package-lock.json
npm install
- Configure setupTests.js

-- File: src/setupTests.js

const { TextEncoder, TextDecoder } = require("util");
global.TextEncoder = TextEncoder;
global.TextDecoder = TextDecoder;

const { ReadableStream, TransformStream } = require("stream/web");
global.ReadableStream = ReadableStream;
global.TransformStream = TransformStream;

const { MessageChannel } = require("worker_threads");
const mc = new MessageChannel();

global.MessageChannel = MessageChannel;
global.MessagePort = mc.port1.constructor;

const Enzyme = require("enzyme");
const Adapter = require("enzyme-adapter-react-16");

Enzyme.configure({ adapter: new Adapter() });
- Create Unit Test File

-- File: src/CohortDetails.test.js

import React from "react";
import { mount, shallow } from "enzyme";
import CohortDetails from "./CohortDetails";
import { CohortData } from "./Cohort";

describe("Cohort Details Component", () => {

  test("should create the component", () => {
    const wrapper = shallow(<CohortDetails />);
    expect(wrapper.exists()).toBe(true);
  });

  test("should initialize the props", () => {
    const cohort = CohortData[0];
    const wrapper = mount(<CohortDetails cohort={cohort} />);
    expect(wrapper.props().cohort).toEqual(cohort);
  });

  test("should display cohort code in h3", () => {
    const cohort = CohortData[0];
    const wrapper = mount(<CohortDetails cohort={cohort} />);
    expect(wrapper.find("h3").text()).toContain(cohort.code);
  });

  test("should always render same html", () => {
    const cohort = CohortData[0];
    const wrapper = shallow(<CohortDetails cohort={cohort} />);
    expect(wrapper).toMatchSnapshot();
  });

});
- Run Tests
npm test
 Common Issues & Fixes
 Cheerio Error
Cannot find module 'cheerio/lib/utils'

 Fix:

npm install cheerio@0.22.0
 MessagePort / Stream Errors

 Fixed using polyfills in setupTests.js

 Learning Outcomes
Unit testing in React
Using Jest and Enzyme
Snapshot testing
Debugging dependency issues
```
