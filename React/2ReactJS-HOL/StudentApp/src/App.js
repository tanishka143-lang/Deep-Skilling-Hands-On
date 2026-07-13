import React from "react";
import Home from "./components/Home";
import About from "./components/About";
import Contact from "./components/Contact";

function App() {
  return (
    <div style={{ textAlign: "center", marginTop: "30px" }}>
      <h1>Student Management Portal</h1>
      <hr />
      <Home />
      <About />
      <Contact />
    </div>
  );
}

export default App;
