import React from "react";
import ListofPlayers from "./ListofPlayers";
import Scorebelow70 from "./Scorebelow70";
import { OddPlayers } from "./OddPlayers";
import { EvenPlayers } from "./EvenPlayers"; 
import ListofIndianPlayers from "./ListofIndianPlayers";

function App() {
  const players = [
    { name: "Jack", score: 50 },
    { name: "Michael", score: 70 },
    { name: "John", score: 40 },
    { name: "Ann", score: 61 },
    { name: "Elisabeth", score: 61 },
    { name: "Sachin", score: 95 },
    { name: "Dhoni", score: 100 },
    { name: "Virat", score: 84 },
    { name: "Jadeja", score: 64 },
    { name: "Raina", score: 75 },
    { name: "Rohit", score: 80 },
  ];

  const T20Players = ["First Player", "Second Player", "Third Player"];
  const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];
  const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  const IndianTeam = [
    "Sachin1",
    "Dhoni2",
    "Virat3",
    "Rohit4",
    "Yuvaraj5",
    "Raina6",
  ];

  const flag = false;

  return (
    <div>
      {/* IF block (flag === true) */}
      {flag ? (
        <>
          <h1>List of Players</h1>
          <ul>
            <ListofPlayers players={players} />
          </ul>
          <hr />
          <h1>List of Players having Scores Less than 70</h1>
          <ul>
            <Scorebelow70 players={players} />
          </ul>
        </>
      ) : (
        // ELSE block (flag === false)
        <>
          <h1>Indian Team</h1>
          <h1>Odd Players</h1>
          <ul>
            <OddPlayers players={IndianTeam} />
          </ul>
          <hr />
          <h1>Even Players</h1>
          <ul>
            <EvenPlayers players={IndianTeam} />
          </ul>
          <hr />
          <h1>List of Indian Players Merged:</h1>
          <ul>
            <ListofIndianPlayers IndianPlayers={IndianPlayers} />
          </ul>
        </>
      )}
    </div>
  );
}

export default App;
