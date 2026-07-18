import React from "react";
import EventExamples from "./components/EventExamples";
import CurrencyConvertor from "./components/CurrencyConvertor";

function App() {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Event Examples App</h1>

      <EventExamples />

      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
