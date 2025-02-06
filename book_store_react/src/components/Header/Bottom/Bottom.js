import React from "react";
import { Link, NavLink } from "react-router-dom";
import Search from "../../Form/Search";
import Badge from "../Badge";
import "./Bottom.css";

class Bottom extends React.Component {
  constructor(props) {
    super(props);
    this.state = {

    }
  }

  hiddenOnScroll = () => {
    let headerTopHeight = document.querySelector('.header-top').offsetHeight;
    if (window.scrollY < headerTopHeight) {
      document.querySelectorAll('.display-onscroll').forEach((item) => {
        item.style.setProperty('display', 'none', 'important');
      });
      document.querySelector('.header-bottom').style.position = 'relative';
      document.querySelector('.display-search-onscroll').classList.add('hide-search');
    } else {
      document.querySelector('.header-bottom').style.position = 'fixed';
      let displayOnScrollList = document.querySelectorAll('.display-onscroll');
      displayOnScrollList.forEach((item, index) => {
        if (index > 1)
          item.style.setProperty('display', 'flex', 'important');
        else
          item.style.display = 'flex';
      });
      document.querySelector('.display-search-onscroll').classList.remove('hide-search');
    }
  }

  componentDidMount() {
    this.hiddenOnScroll();
    window.addEventListener('scroll', this.hiddenOnScroll);
  }

  render() {
    return (
      <div className="header-bottom bg-success">
        <nav className="navbar navbar-expand-lg container-xxl m-auto">
          <div className="container-fluid justify-content-between flex-row-reverse flex-lg-row align-items-center">
            <div className="collapse navbar-collapse">
              <ul className="navbar-nav flex-row d-none d-lg-flex">
                <li className="nav-item">
                  <NavLink className="nav-link" activeClassName="active" to="/" exact>Home</NavLink>
                </li>
                <li className="nav-item">
                  <NavLink className="nav-link" activeClassName="active" to="/features" exact>Features</NavLink>
                </li>
                <li className="nav-item">
                  <NavLink className="nav-link" activeClassName="active" to="/contact" exact>Contact</NavLink>
                </li>
                <li className="nav-item">
                  <NavLink className="nav-link" activeClassName="active" to="/about" exact>About</NavLink>
                </li>
              </ul> 
            </div>
            <div className="user d-flex align-items-center justify-content-end flex-grow-0 flex-sm-grow-1">
              <Search formClasses="input-group my-1 mx-4 display-onscroll d-none d-sm-flex" btnClasses="btn btn-warning"></Search>
              <a className="text-white me-3 d-flex d-sm-none display-onscroll" data-bs-toggle="collapse"
                href="#collapseSearch" role="button" aria-expanded="false" aria-controls="collapseSearch">
                <i className="bi bi-search"></i>
              </a>
              <Link to="/wishlist"
                className="header-top-list-wishlist col d-flex justify-content-center align-items-center text-decoration-none text-white display-onscroll">
                <i className="bi bi-heart me-3 position-relative">
                  <Badge
                    className="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger"
                    api="https://reqres.in/api/users?page=1">
                  </Badge>
                </i>
              </Link>
              <Link to="/cart"
                className="header-top-list-cart col d-flex justify-content-center align-items-center text-decoration-none text-white display-onscroll">
                <i className="bi bi-cart2 me-3 position-relative">
                  <Badge
                    className="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger"
                    api="https://reqres.in/api/users?page=1">
                  </Badge>
                </i>
              </Link>
              <a className="user-icon d-flex align-items-center justify-content-center text-decoration-none"
                data-bs-toggle="offcanvas" href="#offcanvasUser" role="button" aria-controls="offcanvasUser">
                <i className="bi bi-person-circle text-white me-2"></i>
                <i className="bi bi-caret-down-fill text-white"></i>
              </a>
            </div>
            <div className="d-block d-lg-none">
              <ul className="navbar-nav flex-row">
                <li className="nav-item">
                  <a className="px-3 d-inline-block" data-bs-toggle="offcanvas" href="#offcanvasNavbar" role="button"
                    aria-controls="offcanvasNavbar">
                    <i className="bi bi-text-left text-white"></i>
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
        <div className="offcanvas offcanvas-start" tabIndex="-1" id="offcanvasNavbar"
          aria-labelledby="offcanvasNavbarLabel">
          <div className="offcanvas-header">
            <h5 className="offcanvas-title" id="offcanvasNavbarLabel">Menu</h5>
            <button type="button" className="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
          </div>
          <div className="offcanvas-body p-0">
            <div className="">
              <ul className="navbar-nav">
                <li className="nav-item" data-bs-dismiss="offcanvas" aria-label="Close">
                  <NavLink className="nav-link" activeClassName="active" to="/" exact>Home</NavLink>
                </li>
                <li className="nav-item" data-bs-dismiss="offcanvas" aria-label="Close">
                  <NavLink className="nav-link" activeClassName="active" to="/features" exact>Features</NavLink>
                </li>
                <li className="nav-item" data-bs-dismiss="offcanvas" aria-label="Close">
                  <NavLink className="nav-link" activeClassName="active" to="/contact" exact>Contact</NavLink>
                </li>
                <li className="nav-item" data-bs-dismiss="offcanvas" aria-label="Close">
                  <NavLink className="nav-link" activeClassName="active" to="/about" exact>About</NavLink>
                </li>
              </ul>
            </div>
          </div>
        </div>
        <div className="offcanvas offcanvas-end" tabIndex="-1" id="offcanvasUser" aria-labelledby="offcanvasUserLabel">
          <div className="offcanvas-header">
            <h5 className="offcanvas-title" id="offcanvasUserLabel">Hello, Bui Van Tung</h5>
            <button type="button" className="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
          </div>
          <div className="offcanvas-body p-0">
            <div className="">
              <ul className="navbar-nav">
                <li className="nav-item">
                  <a className="nav-link" href="/user/profile">Profile</a>
                </li>
                <li className="nav-item">
                  <a className="nav-link d-flex justify-content-between align-items-center" href="/user/notification">
                    Notification
                    <Badge
                      className="badge rounded-pill text-bg-danger"
                      api="https://reqres.in/api/users?page=1">
                    </Badge>
                  </a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="/user/order">Orders</a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="/user/addresses">Addresses</a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="/user/voucher">Vouchers</a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="/user/seen">Seen Products</a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="/user/comment">My Comments</a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="/seller/registration">Become a seller</a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="/logout">Logout</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
        <div className="collapse display-search-onscroll d-sm-none" id="collapseSearch">
          <div className="input-group py-2 mx-1 w-auto">
            <input type="text" className="form-control" aria-label="Example text with button addon"
              aria-describedby="button-addon1" placeholder="Search" />
            <button className="btn btn-warning" type="button" id="button-addon1">Search</button>
          </div>
        </div>
      </div>
    )
  }
}

export default Bottom;
