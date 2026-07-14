import { CalculateScore } from "./components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        Name="Tanishka"
        School="ABC School"
        total={450}
        goal={5}
      />
    </div>
  );
}

export default App;
