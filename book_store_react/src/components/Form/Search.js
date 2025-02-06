import React from "react";

class Search extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
    }
  }

  componentDidMount() {
    
  }

  render() {
    return (
      <div className={this.props.formClasses}>
        <input type="text" className="form-control" placeholder="Search" />
        <button className={this.props.btnClasses} type="button">Search</button>
      </div>
    )
  }
}

export default Search;
