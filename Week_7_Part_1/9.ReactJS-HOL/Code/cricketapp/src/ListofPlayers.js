import React from "react";

function ListofPlayers({ players }) {
  return (
    <>
      {players.map((item, index) => (
        <li key={index}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </>
  );
}

export default ListofPlayers;
