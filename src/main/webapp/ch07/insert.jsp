<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도시 추가</title>
</head>
<body style="margin : 50px">
<h1>도시 추가</h1>
	  <hr>
	  <form action="/jw/ch07/city/insert" method ="post">
	  	<input type= "text" name="name" placeholder="도시 이름"><br><br>
	  	<input type= "text" name= "countrycode" value="KOR"><br><br>
	  	<input type= "text" name="district" placeholder="광역시도 이름"><br><br>
	  	<input type= "text" name= "population" placeholder="인구수"><br><br>
	  	<input type= "submit" value= "제출">
	  </form>
</body>
</html>