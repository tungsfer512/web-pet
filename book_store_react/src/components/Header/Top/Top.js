import React from "react";
import { Link, } from "react-router-dom";
import "./Top.css";
import logo from "../../../assets/images/logo.png";
import Badge from "../Badge";
import Search from "../../Form/Search";

class Top extends React.Component {
  constructor(props) {
    super(props);
    this.state = {

    }
  }

  render() {
    return (
      <div className="header-top row flex-column flex-lg-row pt-4 pb-0 pb-lg-4 container-xxl m-auto">
        <div className="header-top-logo col d-flex justify-content-center">
          <Link to="/">
            <img className="img-fluid" src={logo} alt="" />
          </Link>
        </div>
        <div className="header-top-search col col-lg-6 d-flex flex-column mt-3 mt-lg-0">
          <Search formClasses="input-group mb-2" btnClasses="btn btn-success"></Search>
          <Link className="align-self-end advanced-search" to="/advanced-search">+ Advanced Search</Link>
        </div>
        <div className="header-top-list col d-flex pt-3 pt-lg-0">
          <Link to="/wishlist"
            className="header-top-list-wishlist col d-flex justify-content-center align-items-center mb-2 text-decoration-none text-black">
            <i className="bi bi-heart me-3 position-relative">
              <Badge
                className="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger"
                api="https://reqres.in/api/users?page=2">
              </Badge>
            </i>
            Wishlist
          </Link>
          <Link to="/cart"
            className="header-top-list-cart col d-flex justify-content-center align-items-center mb-2 text-decoration-none text-black">
            <i className="bi bi-cart2 me-3 position-relative">
              <Badge
                className="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger"
                api="https://reqres.in/api/users?page=1">
              </Badge>
            </i>
            Cart
          </Link>
        </div>
      </div>
    )
  }
}

export default Top;
