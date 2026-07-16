import React from "react";
import Cart from "./Cart";

function OnlineShopping() {
  const items = [
    { name: "Laptop", price: 80000 },
    { name: "TV", price: 120000 },
    { name: "Washing Machine", price: 50000 },
    { name: "Mobile", price: 30000 },
    { name: "Fridge", price: 70000 },
  ];

  return (
    <div style={{ textAlign: "center" }}>
      <h1 style={{ color: "green" }}>Items Ordered :</h1>
      <Cart items={items} />
    </div>
  );
}

export default OnlineShopping;
