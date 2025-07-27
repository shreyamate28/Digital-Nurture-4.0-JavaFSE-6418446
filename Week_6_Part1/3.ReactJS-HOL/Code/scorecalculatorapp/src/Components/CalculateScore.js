// src/Components/CalculateScore.js

import '../Stylesheets/mystyle.css'; // Import the stylesheet

const percentToDecimal = (decimal) => {
  return (decimal.toFixed(2) + '%');
}

const calcScore = (total, goal) => {
  return percentToDecimal(total / goal);
}

export const CalculateScore = ({ Name, School, total, goal }) => (
  <div className="formatstyle">
    <h1>Student Details:</h1>
    <div className="Name">
      <b><span>Name:</span></b>
      <span> {Name}</span>
    </div>
    <div className="School">
      <b><span>School:</span></b>
      <span> {School}</span>
    </div>
    <div className="Total">
      <b><span>Total:</span></b>
      <span> {total}Marks</span>
    </div>
    <div className="Score">
      <b><span>Score:</span></b>
      <span>
        {calcScore(
          total,
          goal
        )}
      </span>
    </div>
  </div>
);