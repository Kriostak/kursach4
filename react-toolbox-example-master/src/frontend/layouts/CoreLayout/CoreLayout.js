import React from 'react';
import PurpleAppBar from '../../component/PurpleAppBar';      // AppBar with simple overrides
import SuccessButton from '../../component/SuccessButton';    // A button with complex overrides
import { Button } from 'react-toolbox/lib/button'; // Bundled component import

const App = () => (
  <div>
    <PurpleAppBar />
    <section style={{ padding: 20 }}>
      <SuccessButton label='Success' primary raised />
      <Button label='Primary Button' primary />
    </section>
  </div>
);

export default App;