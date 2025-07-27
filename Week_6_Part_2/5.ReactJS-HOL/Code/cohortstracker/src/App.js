import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    {
      id: 'INTADMDF10',
      track: '.NET FSD',
      startedOn: '22-Feb-2022',
      status: 'Scheduled',
      coach: 'Aathma',
      trainer: 'Jojo Jose'
    },
    {
      id: 'ADM21JF014',
      track: 'Java FSD',
      startedOn: '10-Sep-2021',
      status: 'Ongoing',
      coach: 'Apoorv',
      trainer: 'Elisa Smith'
    },
    {
      id: 'CDBJF21025',
      track: 'Java FSD',
      startedOn: '24-Dec-2021',
      status: 'Ongoing',
      coach: 'Aathma',
      trainer: 'John Doe'
    }
  ];
  return (
  <div>
    <h2>Cohorts Details</h2>
    <div style={{ display: 'flex' }}>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} {...cohort} />
      ))}
    </div>
  </div>
);


 
}

export default App;
