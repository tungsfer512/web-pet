import React from "react";
import { Switch, Route } from "react-router-dom";

import About from "../Content/About";
import Contact from "../Content/Contact";
import Features from "../Content/Features";
import Home from "../Content/Home/Home";

class Content extends React.Component {
  constructor(props) {
    super(props);
    this.state = {

    }
  }

  render() {
    return (
      <div className="content">
        hello content

        <Switch>
          <Route path='/' exact>
            <Home></Home>
          </Route>
          <Route path='/features' exact>
            <Features></Features>
          </Route>
          <Route path='/contact' exact>
            <Contact></Contact>
          </Route>
          <Route path='/about' exact>
            <About></About>
          </Route>
        </Switch>
      </div>
    )
  }
}

export default Content;
