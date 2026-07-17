import React from "react";

function IndianPlayers() {
  const players = [
    "Player1",
    "Player2",
    "Player3",
    "Player4",
    "Player5",
    "Player6",
  ];

  // destructuring
  const [p1, p2, p3, p4, p5, p6] = players;

  const oddTeam = [p1, p3, p5];
  const evenTeam = [p2, p4, p6];

  // merge arrays
  const T20players = ["Virat", "Rohit"];
  const RanjiPlayers = ["Pujara", "Rahane"];

  const mergedPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      {oddTeam.map((p, i) => (
        <p key={i}>{p}</p>
      ))}

      <h2>Even Team Players</h2>
      {evenTeam.map((p, i) => (
        <p key={i}>{p}</p>
      ))}

      <h2>Merged Players</h2>
      {mergedPlayers.map((p, i) => (
        <p key={i}>{p}</p>
      ))}
    </div>
  );
}

export default IndianPlayers;
