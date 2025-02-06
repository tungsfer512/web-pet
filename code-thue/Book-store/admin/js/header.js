$(window).load(function () {
  var headerTopCartTrigger = $('.header-top-list-cart.header-top-dropdown-trigger');
  var headerTopWishlistTrigger = $('.header-top-list-wishlist.header-top-dropdown-trigger');
  var headerTopCartDropdown = $('.header-top-list .header-top-list-cart-dropdown');
  var headerTopWishlistDropdown = $('.header-top-list .header-top-list-wishlist-dropdown');

  headerTopCartTrigger.click(function (e) {
    headerTopCartDropdown.toggleClass('dropdown-active');
  });
  headerTopWishlistTrigger.click(function (e) {
    headerTopWishlistDropdown.toggleClass('dropdown-active');
  });
  var headerNavTopDropdown = $('.header-navbar-top-dropdown');
  var headerNavTopDropdownTrigger = $('.header-navbar-top-dropdown-trigger');
  headerNavTopDropdownTrigger.click(function () {
    headerNavTopDropdown.toggleClass('dropdown-active');
  });
  var headerNavFixedDropdown = $('.header-navbar-fixed-dropdown');
  var headerNavFixedDropdownTrigger = $('.header-navbar-fixed-dropdown-trigger');
  headerNavFixedDropdownTrigger.click(function () {
    headerNavFixedDropdown.toggleClass('dropdown-active');
  });
  $(window).scroll(function () {
    if (headerTopCartDropdown.hasClass('dropdown-active')) {
      headerTopCartDropdown.removeClass('dropdown-active');
    }
    if (headerTopWishlistDropdown.hasClass('dropdown-active')) {
      headerTopWishlistDropdown.removeClass('dropdown-active');
    }
    if (headerNavTopDropdown.hasClass('dropdown-active')) {
      headerNavTopDropdown.removeClass('dropdown-active');
    }
    if (headerNavFixedDropdown.hasClass('dropdown-active')) {
      headerNavFixedDropdown.removeClass('dropdown-active');
    }
    if ($(document).scrollTop() >= $('.header').height() - $('.header-navbar-top').height()) {
      $('.header-navbar-fixed').css({
        "position": "fixed",
        "display": "flex",
      });
    } else {
      $('.header-navbar-fixed').css({
        "display": "none",
        // "position": "relative",
      });
    };
  });
  var headerNavCartTrigger = $('.header-navbar-fixed-right-cart-dropdown-trigger');
  var headerNavCartDropdown = $('.header-navbar-fixed-right-cart-dropdown');
  headerNavCartTrigger.click(function (e) {
    headerNavCartDropdown.toggleClass('dropdown-active');
  });
  var headerNavWishlistTrigger = $('.header-navbar-fixed-right-wishlist-dropdown-trigger');
  var headerNavWishlistDropdown = $('.header-navbar-fixed-right-wishlist-dropdown');
  headerNavWishlistTrigger.click(function (e) {
    headerNavWishlistDropdown.toggleClass('dropdown-active');
  });
  var headerNavFixedUserTrigger = $('.header-navbar-fixed-right-user-dropdown-trigger');
  var headerNavFixedUserDropdown = $('.header-navbar-fixed-right-user-dropdown');
  headerNavFixedUserTrigger.click(function (e) {
    headerNavFixedUserDropdown.toggleClass('dropdown-active');
  });
});
