<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>도시 추가</title>
</head>
<body style="margin: 50px">
	<h1>도시 추가</h1>
	<hr>
	<form action="/jw/ch07/kcity/insert" method="post">
		<input type="text" name="name" placeholder="도시 이름"><br><br>
		<input type="text" name="countryCode" value="KOR"><br><br>
		<!-- <input type="text" name="district" placeholder="광역시도 이름"><br><br> -->
		<select name="district">
			<c:forEach var="dist" items="${districts}">
				<option value="${dist}" ${dist eq "Kyonggi" ? "selected" : ""}>${dist}</option>
			</c:forEach>
		</select><br><br>
		<input type="text" name="population" placeholder="인구수"><br><br>
		<input type="submit" value="제출">
	</form>
</body>
</html>