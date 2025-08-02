import React from "react";

export function OddPlayers({ players }) {
  const [first, , third, , fifth] = players;

  return (
    <>
      <li>First : {first}</li>
      <li>Third : {third}</li>
      <li>Fifth : {fifth}</li>
    </>
  );
}
