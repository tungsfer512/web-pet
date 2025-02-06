let categories = [
  {
    link: '../../2_experiences/coureg_cate.html',
    icon: "./assets/images/category01.png",
    title: "Công viên & công viên nước"
  },
  {
    link: '../../2_experiences/coureg_mcate.html',
    icon: "./assets/images/category02.png",
    title: "Tour & ngắm cảnh"
  },
  {
    link: '../../3_search/search.html',
    icon: "./assets/images/category03.png",
    title: "Ưu đãi khách sạn"
  },
  {
    link: '../../2_experiences/coureg_mcate.html',
    icon: "./assets/images/category04.png",
    title: "Thể thao & hoạt động ngoài trời"
  },
  {
    link: '../../4_vehicle/vehicle.html',
    icon: "./assets/images/category05.png",
    title: "Tàu cao tốc Việt Nam"
  },
  {
    link: '../../2_experiences/coureg_mcate.html',
    icon: "./assets/images/category06.png",
    title: "Thư giãn"
  },
  {
    link: '../../4_vehicle/airport_transfer.html',
    icon: "./assets/images/category07.png",
    title: "Xe riêng đưa đón sân bay"
  },
  {
    link: '../../0_global/wifi_sim.html',
    icon: "./assets/images/category08.png",
    title: "WiFi & SIM"
  },
]

let categoryContainer = document.querySelector(".category .container");
categoryContainer.innerHTML = '';
categories.forEach((category) => {
  let categoryItem = `
    <a href = "${category.link}" class="category-item">
      <div class="category-item-icon">
        <img src="${category.icon}" alt="">
      </div>
      <div class="category-item-text">
        ${category.title}
      </div>
    </a>
  `;
  categoryContainer.innerHTML += categoryItem;
})