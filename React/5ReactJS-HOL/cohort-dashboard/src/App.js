import React from "react";
import CohortDetails from "./CohortDetails";

function App() {
  const cohorts = [
    {
      name: "React Batch 1",
      startDate: "01-Jan-2024",
      endDate: "01-Mar-2024",
      status: "ongoing",
    },
    {
      name: "Angular Batch",
      startDate: "01-Oct-2023",
      endDate: "01-Dec-2023",
      status: "completed",
    },
  ];

  return (
    <div>
      <h1>Cohort Dashboard</h1>
      {cohorts.map((c, index) => (
        <CohortDetails key={index} cohort={c} />
      ))}
    </div>
  );
}

export default App;
