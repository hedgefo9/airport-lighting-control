<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Search</title>
		<script src="https://code.jquery.com/jquery-3.3.1.js"
			integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
			crossorigin="anonymous"></script>
		<link rel="stylesheet" href="./webres/css/common.css" type="text/css" />
		<script type="text/javascript" src="./webres/js/common.js"></script>
	</head>
	<body>
		<div id="form">
			<span class="near_date_restriction">от</span>
			<input type="text" placeholder="after this date" id="adate" value="2019-02-27 23:59"/>
			<span class="near_date_restriction">до</span>
			<input type="text" placeholder="before this date" id="bdate" value="2019-09-12 16:02"/>
			
			<div id="checkIsDesc">
				<label class="container_cb">По убыванию
				  <input type="checkbox" id="isDesc" checked="checked">
				  <span class="checkmark"></span>
				</label>
			</div>
			
			<button id="search">Искать</button>
		</div>
		<div id="result">
		</div>
	</body>
</html>