import React from 'react';
import officeImg from './office.jpg';   // make sure office.jpg is inside src folder

function OfficeList() {
  const title = "Office Space";

  const offices = [
    { name: "DBS", rent: 50000, address: "Chennai" },
    { name: "Regus", rent: 75000, address: "Bangalore" },
    { name: "WeWork", rent: 45000, address: "Hyderabad" }
  ];

  return (
    <div style={{ padding: "20px", textAlign: "left" }}>
      <h1>{title} , at Affordable Range</h1>

      {/* Office list */}
      {offices.map((office, index) => {
        const rentColor = office.rent <= 60000 ? 'red' : 'green';

        return (
          <div key={index} style={{ marginBottom: "30px" }}>
            {/* Slightly bigger image */}
            <img src={officeImg} width="200px" alt="Office" />

            {/* Details */}
            <h2>Name: {office.name}</h2>
            <h3 style={{ color: rentColor }}>Rent: Rs. {office.rent}</h3>
            <h3>Address: {office.address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default OfficeList;
