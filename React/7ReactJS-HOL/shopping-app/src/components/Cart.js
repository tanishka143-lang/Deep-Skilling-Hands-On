import React from "react";

function Cart(props) {
  return (
    <table
      border="1"
      style={{
        margin: "auto",
        borderCollapse: "collapse",
        textAlign: "center",
      }}
    >
      <thead>
        <tr style={{ backgroundColor: "#d4edda", color: "green" }}>
          <th>Name</th>
          <th>Price</th>
        </tr>
      </thead>

      <tbody>
        {props.items.map((item, index) => (
          <tr key={index}>
            <td>{item.name}</td>
            <td>{item.price}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}

export default Cart;
