import React from 'react';
import {BrowserRouter } from 'react-router-dom';

import Header from './components/Header/Header';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import "../node_modules/bootstrap-icons/font/bootstrap-icons.css";
import "../node_modules/bootstrap/dist/js/bootstrap.bundle";
import Content from './components/Content/Content';


class App extends React.Component {

  constructor(props) {
    super(props);
    this.state = {};
  }

  render() {
    return (
      <BrowserRouter>
        <div className="App">
          <Header></Header>
          <Content></Content>
        </div>
      </BrowserRouter>
    );
  }
}

export default App;
