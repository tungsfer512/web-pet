import React from "react";

import Bottom from "./Bottom/Bottom";
import Top from "./Top/Top";

class Header extends React.Component {
  constructor(props) {
    super(props);
    this.state = {

    }
  }

  render() {
    return (
      <header className="header">
        <Top></Top>
        <Bottom></Bottom>
      </header>
    )
  }
}

export default Header;
