import React from "react";

export function EvenPlayers({ players }) {
  const [, second, , fourth, , sixth] = players;

  return (
    <>
      <li>Second : {second}</li>
      <li>Fourth : {fourth}</li>
      <li>Sixth : {sixth}</li>
    </>
  );
}
