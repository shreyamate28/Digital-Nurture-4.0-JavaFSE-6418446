import React from "react";

function Scorebelow70({ players }) {
  const filtered = players.filter((item) => item.score <= 70);

  return (
    <>
      {filtered.map((item, index) => (
        <li key={index}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </>
  );
}

export default Scorebelow70;
