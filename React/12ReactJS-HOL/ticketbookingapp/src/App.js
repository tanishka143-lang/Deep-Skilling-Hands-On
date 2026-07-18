import React, { useState } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  let content;
  if (isLoggedIn) {
    content = <UserPage onLogout={handleLogout} />;
  } else {
    content = <GuestPage onLogin={handleLogin} />;
  }

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>{content}</div>
  );
}

export default App;
