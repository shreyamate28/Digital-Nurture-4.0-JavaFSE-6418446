import React from 'react';

const flights = [
  { id: 1, airline: 'IndiGo', from: 'Delhi', to: 'Mumbai', time: '10:00 AM' },
  { id: 2, airline: 'SpiceJet', from: 'Bangalore', to: 'Chennai', time: '1:30 PM' },
  { id: 3, airline: 'Air India', from: 'Hyderabad', to: 'Kolkata', time: '5:45 PM' },
];

function FlightList({ isLoggedIn }) {
  return (
    <div style={{ marginTop: '20px' }}>
      <h2>Available Flights</h2>
      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>Airline</th>
            <th>From</th>
            <th>To</th>
            <th>Time</th>
            {isLoggedIn && <th>Action</th>}
          </tr>
        </thead>
        <tbody>
          {flights.map((flight) => (
            <tr key={flight.id}>
              <td>{flight.airline}</td>
              <td>{flight.from}</td>
              <td>{flight.to}</td>
              <td>{flight.time}</td>
              {isLoggedIn && (
                <td>
                  <button>Book Now</button>
                </td>
              )}
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default FlightList;
