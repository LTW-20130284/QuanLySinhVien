<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
<title>Xem phim hay</title>
<script src="https://kit.fontawesome.com/f4e29e0a7a.js"
	crossorigin="anonymous"></script>
<meta charset="UTF-8">
<!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
body {
	font-family: "Lato", sans-serif
}

.mySlides {
	display: none
}
</style>
</head>


<body>

	<!-- Navbar -->
	<div class="w3-top">
		<div class="w3-bar w3-black w3-card">

			<a href="index.jsp" class="w3-bar-item w3-button w3-padding-large">Trang
				chủ</a>
				 <a href="#Animelist"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">Danh
				sách phim</a>
				 <a href="#Movie"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">Danh
				sách Movie</a>
				 <a href="viewservlet"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">Thông
				tin cá nhân</a>
				 <a href="#contact"
				class="w3-bar-item w3-button w3-padding-large w3-hide-small">Phản
				hồi</a>
			<form action="logout" method="post">
				<button class="w3-padding-large w3-hover-red w3-hide-small w3-right">
					<i class="fa-solid fa-right-to-bracket w3-hover-opacity"></i>
				</button>
			</form>
			
		</div>
	</div>


	</div>

	<!-- Page content -->
	<div class="w3-content" style="max-width: 2000px; margin-top: 46px">

		<!-- Automatic Slideshow Images -->
		<!-- AOT 1 -->
		<div class="mySlides w3-display-container w3-center">
			<img src="image/AOT.jpg" style="width: 100%">


		</div>
	</div>
	<!-- deathnote 2-->
	<div class="mySlides w3-display-container w3-center">
		<img src="image/814FWjSQFfL._RI_.jpg" style="width: 100%">

	</div>
	<!-- onepiece 3 -->
	<div class="mySlides w3-display-container w3-center">
		<img src="image/onceepiece.jpg" style="width: 100%">

	</div>
	<!-- fullmetal 4 -->
	<div class="mySlides w3-display-container w3-center">
		<img src="image/Áp_phích_phim_Mắt_biếc.jpg" style="width: 100%">

	</div>
	<!-- narutoo 5 -->
	<div class="mySlides w3-display-container w3-center">
		<img src="image/narutoo.jpg" style="width: 100%">

	</div>
	<!-- beach 6-->
	<div class="mySlides w3-display-container w3-center">
		<img src="image/beach.jpg" style="width: 100%">
	</div>



	<!-- Anime Section -->
	<div class="w3-white" id="Animelist">
		<div class="w3-container w3-content w3-padding-64"
			style="max-width: 1200px">
			<h2 class="w3-wide w3-center">Danh sách phim</h2>


			<div class="w3-row-padding w3-padding-32" style="margin: 0 -16px">
				<div class="w3-third w3-margin-bottom">
					<img src="image/1600416894L4l5zaLg9ND2lIk.jpg" alt="MOB"
						style="width: 100%" class="w3-hover-opacity">
					<div class="w3-container w3-black">
						<p>
							<b>Girl From No Where</b>
						</p>
						<p class="w3-opacity">Phát hành: 2021</p>
						<p font color=" white">Cô Gái Đến Từ Hư Vô – Nanno, luôn đào
							khoét, phơi bày những mặt đen tối, tàn nhẫn của những đứa trẻ,
							những cô cậu học sinh tưởng như ngây thơ vô hại. Nanno là ai? Từ
							đâu đến? Cô ta có mục đích gì khi làm vậy? Và vì sao Cô Gái Đến
							Từ Hư Vô sản xuất năm 2018, đến 2020 lại bỗng dưng “hot” trở lại?
						</p>
						<button class="w3-button w3-white w3-margin-bottom"
							onclick="window.location.href= './watchDetails.jsp'">Thông
							tin chi tiết</button>
					</div>
				</div>
				<div class="w3-third w3-margin-bottom">
					<img src="image/Áp_phích_phim_Mắt_biếc.jpg" alt="SketDance"
						style="width: 100%" class="w3-hover-opacity">
					<div class="w3-container w3-black">
						<p>
							<b>Mắt biếc</b>
						</p>
						<p class="w3-opacity">Phát hành:2019</p>
						<p font color=" white">Mắt Biếc là cuốn tiểu thuyết kể về cuộc
							đời của Ngạn. Ngạn sinh ra và lớn lên ở một ngôi làng tên Đo Đo,
							thuộc xã Bình Quế, huyện Thăng Bình, tỉnh Quảng Nam, đây cũng là
							quê quán của tác giả. Lớn lên cùng với Ngạn là cô bạn hàng xóm có
							đôi mắt đẹp tuyệt trần tên Hà Lan. Tuổi thơ của Ngạn và Hà Lan đã
							gắn bó với nhau cùng với những kỉ niệm đẹp như đồi sim, đánh
							trống trường,…</p>
						<button class="w3-button w3-white w3-margin-bottom"
							onclick="window.location.href='./watchDetails.jsp'">Thông
							tin chi tiết</button>
					</div>
				</div>
				<div class="w3-third w3-margin-bottom">
					<img src="image/one-punch-man.jpg" alt="OnePunch"
						style="width: 100%" class="w3-hover-opacity">
					<div class="w3-container w3-black">
						<p>
							<b>One Punch Man</b>
						</p>
						<p class="w3-opacity">Phát hành: 2015</p>
						<p font color=" white">Sau ba năm khổ luyện, Saitama bình
							thường đã có được sức mạnh to lớn cho phép anh ta hạ gục bất cứ
							ai và bất cứ thứ gì chỉ bằng một cú đấm.</p>
						<button class="w3-button w3-white w3-margin-bottom"
							onclick="window.location.href='./watchDetails.jsp'">Thông
							tin chi tiết</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Movie Section -->

	<div class="w3-black" id="Movie">
		<div class="w3-container w3-content w3-padding-64"
			style="max-width: 1200px">
			<h2 class="w3-wide w3-center">Danh sách Movie</h2>
			<div class="w3-row-padding w3-padding-32" style="margin: 0 -16px">
				<div class="w3-third w3-margin-bottom">
					<img src="image/keyvisual_for_promotion-01_1_.jpg" alt="movie1"
						style="width: 100%" class="w3-hover-opacity">
					<div class="w3-container w3-white">
						<p>
							<b>Red</b>
						</p>
						<p class="w3-opacity">Phát hành:2022</p>
						<p>One Piece Film: Bộ phim có thể sẽ đề cập đến một số chi
							tiết liên quan đến cốt truyện của bộ truyện và tầm quan trọng của
							một số nhân vật tham gia trong đó, chẳng hạn như Uta, Gordon,
							Shanks và băng hải tặc Mũ Rơm.</p>
						<button class="w3-button w3-black w3-margin-bottom"
							onclick="window.location.href='./watchMovieDetails.jsp'">Thông
							tin chi tiết</button>

					</div>
				</div>
				<div class="w3-third w3-margin-bottom">
					<img src="image/greavy.jpeg" alt="gravy" style="width: 100%"
						class="w3-hover-opacity">
					<div class="w3-container w3-white">
						<p>
							<b>Grave Of Fireflies</b>
						</p>
						<p class="w3-opacity">Phát hành:1988</p>
						<p>Trong phần sau của Thế chiến thứ hai, một cậu bé và em gái
							mồ côi khi mẹ của họ bị giết trong trận ném bom ở Tokyo, bị bỏ
							lại để tự mình sinh tồn trong những gì còn sót lại của cuộc sống
							thường dân ở Nhật Bản</p>
						<!--  <button class="w3-button w3-black w3-margin-bottom" onclick="document.getElementById('ticketModal').style.display='block'">Watch Now</button> -->
						<button class="w3-button w3-black w3-margin-bottom"
							onclick="window.location.href='./watchMovieDetails.jsp'">Thông
							tin chi tiết</button>
					</div>
				</div>
				<div class="w3-third w3-margin-bottom">
					<img src="image/Avatar-Teaser-Poster.jpg" alt="sing"
						style="width: 100%" class="w3-hover-opacity">
					<div class="w3-container w3-white">
						<p>
							<b>Avatar</b>
						</p>
						<p class="w3-opacity">Phát hành:2009</p>
						<p>Trong phim, Trái đất được mô tả như một hành tinh hoang tàn
							vì nạn phá hoại môi trường, thông qua câu thoại của Jake: "Họ đã
							giết Mẹ thiên nhiên của họ. Và họ sắp làm điều tương tự tại đây".
							Dù Pandora là thế giới giả tưởng, những gì James Cameron nỗ lực
							cảnh báo là có thực. Lòng tham khai thác tài nguyên của con người
							- như cách quân đội Trái đất hủy diệt Pandora để tìm khoáng chất
							quý hiếm Unobtainium - đang khiến những mảng xanh ngày một biến
							mất.</p>
						<button class="w3-button w3-black w3-margin-bottom"
							onclick="window.location.href='./watchMovieDetails.jsp'">Thông
							tin chi tiết</button>
					</div>
				</div>


			</div>
		</div>
	</div>

	<!-- search -->
	<div id="search" class="w3-modal">
		<!-- Search model end -->
		<form action="search" target="_blank">
			<div class="search-close-switch">
				<i class="icon_close"></i>
			</div>
			<input class="w3-input w3-border" type="search"
				placeholder="Search Here....">
		</form>
	</div>



	<!-- The Contact Section -->
	<div class="w3-container w3-content w3-padding-64"
		style="max-width: 800px" id="contact">
		<h2 class="w3-wide w3-center">Phản hồi</h2>
		<div class="w3-row w3-padding-32">
			<div class="w3-col m6 w3-large w3-margin-bottom">
				<i class="fa fa-map-marker" style="width: 30px"></i> ManUTD, England<br>
				<i class="fa fa-phone" style="width: 30px"></i> Phone: +123456789<br>
				<i class="fa fa-envelope" style="width: 30px"> </i> Email:
				ManUTD@mail.com<br>
			</div>
			<div class="w3-col m6">
				<form action="/action_page.php" target="_blank">
					<div class="w3-row-padding" style="margin: 0 -16px 8px -16px">
						<div class="w3-half">
							<input class="w3-input w3-border" type="text" placeholder="Name"
								required name="Name">
						</div>
						<div class="w3-half">
							<input class="w3-input w3-border" type="text" placeholder="Email"
								required name="Email">
						</div>
					</div>
					<input class="w3-input w3-border" type="text" placeholder="Message"
						required name="Message">
					<button class="w3-button w3-black w3-section w3-right"
						type="submit">GỬI</button>
				</form>
			</div>
		</div>
	</div>


	<!-- End Page Content -->
	</div>

	

	<!-- Footer -->
	<footer
		class="w3-container w3-padding-64 w3-center w3-opacity w3-light-grey w3-xlarge">
		<i class="fa fa-facebook-official w3-hover-opacity"></i> <i
			class="fa fa-instagram w3-hover-opacity"></i> <i
			class="fa fa-snapchat w3-hover-opacity"></i> <i
			class="fa fa-pinterest-p w3-hover-opacity"></i> <i
			class="fa fa-twitter w3-hover-opacity"></i> <i
			class="fa fa-linkedin w3-hover-opacity"></i>


	</footer>

	<script>
		// Chuyển đổi sau 4s
		var myIndex = 0;
		carousel();

		function carousel() {
			var i;
			var x = document.getElementsByClassName("mySlides");
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			myIndex++;
			if (myIndex > x.length) {
				myIndex = 1
			}
			x[myIndex - 1].style.display = "block";
			setTimeout(carousel, 4000);
		}

		// Được sử dụng để chuyển đổi menu trên màn hình nhỏ khi nhấp vào nút menu
		function myFunction() {
			var x = document.getElementById("navDemo");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}
	</script>

</body>
</html>
