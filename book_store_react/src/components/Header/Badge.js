import React from "react";
import axios from "axios";

class Badge extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      number: 0
    }
  }

  async componentDidMount() {
    let res = await axios.get("https://reqres.in/api/users?page=2");
    console.log(res);
    this.setState({
      number: res.data.data.length
    }) 
  }

  render() {
    console.log(123);
    return (
      <span className={this.props.className}>
        {this.state.number>=9 ? "9+": this.state.number}
      </span>
    )
  }
}

export default Badge;
