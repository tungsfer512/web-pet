const hiddenOnScroll = () => {
  let headerTopHeight = document.querySelector('.header-top').offsetHeight;
  if (scrollY < headerTopHeight) {
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
hiddenOnScroll();
document.onscroll = () => hiddenOnScroll();

$('.center').slick({
  centerMode: true,
  centerPadding: '60px',
  slidesToShow: 5,
  responsive: [
    {
      breakpoint: 768,
      settings: {
        arrows: false,
        centerMode: true,
        centerPadding: '40px',
        slidesToShow: 3
      }
    },
    {
      breakpoint: 480,
      settings: {
        arrows: false,
        centerMode: true,
        centerPadding: '40px',
        slidesToShow: 1
      }
    }
  ]
});