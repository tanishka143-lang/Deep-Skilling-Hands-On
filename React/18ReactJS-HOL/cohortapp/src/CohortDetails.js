import React from "react";

function CohortDetails(props) {
  const { cohort } = props;

  if (!cohort) return <h2>No Data</h2>;

  return (
    <div>
      <h3>{cohort.code}</h3>
      <p>{cohort.name}</p>
      <p>{cohort.status}</p>
    </div>
  );
}

export default CohortDetails;
