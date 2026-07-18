import React from "react";
import EmployeeCard from "./EmployeeCard";

function EmployeeList() {
  const employees = [
    { id: 1, name: "John", role: "Developer" },
    { id: 2, name: "Alice", role: "Designer" },
  ];

  return (
    <div>
      {employees.map((emp) => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  );
}

export default EmployeeList;
