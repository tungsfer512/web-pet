const swiper = new Swiper('.slider', {
  // Optional parameters
  // direction: 'vertical',
  loop: true,

  // Navigation arrows
  navigation: {
    nextEl: '.swiper-button-next',
    prevEl: '.swiper-button-prev',
  },

});

const swiperUuDai = new Swiper('.slider-noi-bat', {
  // Optional parameters
  // direction: 'vertical',
  loop: true,

  // Navigation arrows
  navigation: {
    nextEl: '.swiper-button-next',
    prevEl: '.swiper-button-prev',
  },

});

function openDetail(evt, ColName) {
  // Declare all variables
  var i, tabcontent, tablinks;

  // Get all elements with class="tabcontent" and hide them
  tabcontent = document.getElementsByClassName("container-body-row-tabs-body-panel");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }

  // Get all elements with class="tablinks" and remove the class "active"
  tablinks = document.getElementsByClassName("container-body-row-tabs-header-items");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }

  // Show the current tab, and add an "active" class to the button that opened the tab
  document.getElementById(ColName).style.display = "block";
  evt.currentTarget.className += " active";
}
document.getElementById("defaultOpen").click();


// slider-search-form
$(document).ready(function () {
  $('.search-form-input').click(function () {
    $('.slider-search-form-dropdown').fadeToggle(500);
    if ($('.search-form-input').css("display") !== "none") {
      $(window).click(function (e) {
        if (!$(e.target).closest('.slider-search-form-dropdown').length
          && !$(e.target).closest('.search-form-input').length) {
          $('.slider-search-form-dropdown').fadeOut(500);
          
          if($('.slider-search-form').hasClass('slider-search-form-focus')){
            $('.slider-search-form').toggleClass('slider-search-form-focus');
          }
        }
      });
      $('html, body').animate({scrollTop: $(".slider-content-title").offset().top}, 1000);
      $(window).scroll(function () {
        if ($(window).scrollTop() > $(".slider-content-title").offset().top + $(".slider-search-form-dropdown").height() - 20) {
          $('.slider-search-form-dropdown').fadeOut(500);

          if($('.slider-search-form').hasClass('slider-search-form-focus')){
            $('.slider-search-form').toggleClass('slider-search-form-focus');
          }
        }
      });
    }

    $('.slider-search-form').toggleClass('slider-search-form-focus');
  });
});
