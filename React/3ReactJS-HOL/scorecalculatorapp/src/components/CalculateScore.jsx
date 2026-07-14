import "../StyleSheet/mystyle.css";

export const CalculateScore = ({ Name, School, total, goal }) => {
  const average = total / goal;

  return (
    <div className="formatstyle">
      <h1 style={{ color: "brown" }}>Student Details</h1>

      <p>
        <b>Name:</b> {Name}
      </p>
      <p>
        <b>School:</b> {School}
      </p>
      <p>
        <b>Total Marks:</b> {total}
      </p>
      <p>
        <b>Goal:</b> {goal}
      </p>

      <p>
        <b>Average Score:</b> {average}
      </p>
    </div>
  );
};
