import React from "react";

function App() {
  const office = {
    name: "Tech Park",
    rent: 55000,
    address: "Bangalore",
  };

  const officeList = [
    { name: "Office A", rent: 75000, address: "Mumbai" },
    { name: "Office B", rent: 50000, address: "Delhi" },
    { name: "Office C", rent: 65000, address: "Chennai" },
    { name: "Office D", rent: 45000, address: "Hyderabad" },
  ];

  return (
    <div style={{ textAlign: "center" }}>
      {}
      <h1>Office Space Rental App</h1>

      {}
      <img
        src="https://images.unsplash.com/photo-1497366216548-37526070297c"
        alt="office"
        width="400"
      />

      {}
      <h2>Featured Office</h2>
      <p>Name: {office.name}</p>
      <p style={{ color: office.rent < 60000 ? "red" : "green" }}>
        Rent: {office.rent}
      </p>
      <p>Address: {office.address}</p>

      {}
      <h2>Office List</h2>

      {officeList.map((item, index) => (
        <div key={index} style={{ marginBottom: "15px" }}>
          <p>Name: {item.name}</p>

          {}
          <p style={{ color: item.rent < 60000 ? "red" : "green" }}>
            Rent: {item.rent}
          </p>

          <p>Address: {item.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
