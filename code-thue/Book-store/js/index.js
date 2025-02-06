$(window).load(function () {
  $('.slider-container').slick({
    slidesToShow: 1,
    slidesToScroll: 1,
    dots: false,
    infinite: true,
    speed: 500,
    // fade: true,
    cssEase: 'linear',
    autoplay: true,
    autoplaySpeed: 4000,
    arrows: true, 
    prevArrow: '<button type="button" class="slick-prev"><span class="material-icons">arrow_back</span></button>',
    nextArrow: '<button type="button" class="slick-next"><span class="material-icons">arrow_forward</span></i></button>'
  });
  $('.bestsell-container-content').slick({
    slidesToShow: 6,
    slidesToScroll: 1,
    dots: false,
    infinite: true,
    speed: 500,
    // fade: true,
    cssEase: 'linear',
    autoplay: true,
    autoplaySpeed: 4000,
    arrows: true, 
    prevArrow: '<button type="button" class="slick-prev"><span class="material-icons">arrow_back</span></button>',
    nextArrow: '<button type="button" class="slick-next"><span class="material-icons">arrow_forward</span></i></button>'
  });

  $(".bestsell .slick-arrow").addClass("btn-hover-primary");

});