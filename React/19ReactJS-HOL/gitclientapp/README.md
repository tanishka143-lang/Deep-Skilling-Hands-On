# 19ReactJS-HOL – Git Client App with Unit Testing

---

## Objective

- Understand the need for isolation in testing
- Understand the concept of mocking
- Use Jest for unit testing and mocking

---

## Theory Questions & Answers

### 1. What is Unit Testing?

Unit testing is the process of testing individual components or modules of an application in isolation to ensure they work correctly.

---

### 2. What is Isolation in Testing?

Isolation means testing a module independently without relying on external dependencies like APIs, databases, or other modules.

Why needed:

- Faster tests
- No dependency on network
- Reliable and consistent results

---

### 3. What is Mocking?

Mocking is a technique used to replace real dependencies (like API calls) with fake/dummy implementations during testing.

Example:
Instead of calling GitHub API, we return dummy repository data.

---

### 4. What is Jest?

Jest is a JavaScript testing framework used for:

- Unit testing
- Mocking
- Assertions

It comes pre-installed with Create React App.

---

### 5. What is Axios?

Axios is a promise-based HTTP client used to make API calls.

---

### 6. What are Spies in Testing?

Spies are used to track function calls and verify:

- Whether a function was called
- How many times it was called
- What arguments were passed

---

## Implementation

---

### Step 1: Create React App

```bash
npx create-react-app gitclientapp
cd gitclientapp
npm start
Step 2: Install Axios
npm install axios
Step 3: Create GitClient.js

-- src/GitClient.js

import axios from "axios";

class GitClient {
  getRepositories(username) {
    return axios
      .get(`https://api.github.com/users/${username}/repos`)
      .then((response) => response.data.map((repo) => repo.name));
  }
}

export default new GitClient();
Step 4: Modify App.js

-- src/App.js

import React, { useState } from "react";
import GitClient from "./GitClient";

function App() {
  const [repos, setRepos] = useState([]);

  const fetchRepos = () => {
    GitClient.getRepositories("techiesyed").then((data) => {
      setRepos(data);
    });
  };

  return (
    <div>
      <h1>GitHub Repository List</h1>

      <button onClick={fetchRepos}>Fetch Repositories</button>

      <ul>
        {repos.map((repo, index) => (
          <li key={index}>{repo}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
Step 5: Run Application
npm start
-- Unit Testing
Step 6: Create Test File

-- src/GitClient.test.js

import axios from "axios";
import GitClient from "./GitClient";

jest.mock("axios");

describe("Git Client Tests", () => {
  test("should return repository names for techiesyed", async () => {

    const mockData = {
      data: [
        { name: "repo1" },
        { name: "repo2" }
      ]
    };

    axios.get.mockResolvedValue(mockData);

    const result = await GitClient.getRepositories("techiesyed");

    expect(result).toEqual(["repo1", "repo2"]);
    expect(axios.get).toHaveBeenCalledWith(
      "https://api.github.com/users/techiesyed/repos"
    );
  });
});
Step 7: Run Tests
npm test


-- Conclusion
Learned unit testing in isolation
Implemented mocking using Jest
Avoided real API calls during testing
Built a React app with API integration
```
