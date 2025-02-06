$(window).load(function () {
  $('.quantity span:first-child').click(function () {
    var $input = $(this).parent().find('input');
    var val = parseInt($input.val());
    if (val > 1) {
      $input.val(val - 1);
    }
  });
  $('.quantity span:last-child').click(function () {
    var $input = $(this).parent().find('input');
    var val = parseInt($input.val());
    if (val < 10) {
      $input.val(val + 1);
    }
  });
});