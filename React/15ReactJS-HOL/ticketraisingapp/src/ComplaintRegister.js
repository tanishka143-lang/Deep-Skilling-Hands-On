import React, { useState } from "react";

function ComplaintRegister() {
  const [name, setName] = useState("");
  const [complaint, setComplaint] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();

    // Generate random ID
    const transactionId = Math.floor(Math.random() * 100);

    alert(
      "Thanks " +
        name +
        "\n" +
        "Your Complaint was Submitted.\n" +
        "Transaction ID is: " +
        transactionId,
    );

    // Clear form
    setName("");
    setComplaint("");
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1 style={{ color: "red" }}>Register your complaints here!!!</h1>

      <form onSubmit={handleSubmit}>
        <div style={{ margin: "10px" }}>
          <label>Name: </label>
          <input
            type="text"
            value={name}
            onChange={(e) => setName(e.target.value)}
            required
          />
        </div>

        <div style={{ margin: "10px" }}>
          <label>Complaint: </label>
          <textarea
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            required
          />
        </div>

        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default ComplaintRegister;
