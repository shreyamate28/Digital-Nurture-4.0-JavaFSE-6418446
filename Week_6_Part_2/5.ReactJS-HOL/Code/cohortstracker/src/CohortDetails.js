import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails({ id, track, startedOn, status, coach, trainer }) {
  const statusColor = status === 'Ongoing' ? 'green' : 'blue';

  return (
    <div className={styles.box}>
      <h3 style={{ color: statusColor }}>
        {id} - {track}
      </h3>
      <dl>
        <dt>Started On</dt>
        <dd>{startedOn}</dd>
        <dt>Current Status</dt>
        <dd>{status}</dd>
        <dt>Coach</dt>
        <dd>{coach}</dd>
        <dt>Trainer</dt>
        <dd>{trainer}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
