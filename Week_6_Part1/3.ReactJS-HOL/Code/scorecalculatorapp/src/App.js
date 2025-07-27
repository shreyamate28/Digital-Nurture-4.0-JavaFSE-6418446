// src/App.js

import { CalculateScore } from './Components/CalculateScore';
import './App.css'; // You can keep the default App.css or remove it if not needed

function App() {
  return (
    <div>
      <CalculateScore Name={"Steeve"} School={"DNV Public School"} total={284} goal={300} />
    </div>
  );
}

export default App;