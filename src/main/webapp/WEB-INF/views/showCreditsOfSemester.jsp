<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Insert title here</title>
</head>
<style>
div.ex {
	width: 35%;
	padding: 10px;
	border: 5px solid grey;
	margin: 20px
}

table td {
	text-align: center;
}

p, a, ul, li, td, h1, h2, h3 {
	font-size: 15px;
	color: #000000;
}

h1 {
	font-size: 20px;
	font-weight: bold;
	margin-top: 3px;
}
</style>
<body>
	<h1>학기별 학점 이수 조회</h1>
	<div class="ex">
		<table width="100%" cellpadding="5" cellspacing="0" border="0">
			<tr>
				<td>년도</td>
				<td>학기</td>
				<td>이수학점</td>
				<td>상세보기</td>
			</tr>

			<tr>
				<td>2011</td>
				<td>1</td>
				<td>${credits2011_1}</td>
				<td>클릭</td>
			</tr>

			<tr>
				<td>2011</td>
				<td>2</td>
				<td>${credits2011_2}</td>
				<td>클릭</td>
			</tr>


			<tr>
				<td>2015</td>
				<td>1</td>
				<td>${credits2015_2}</td>
				<td>클릭</td>
			</tr>

			<tr>
				<td>2016</td>
				<td>1</td>
				<td>${credits2016_1}</td>
				<td>클릭</td>
			</tr>

			<tr>
				<td>2016</td>
				<td>2</td>
				<td>${credits2016_2}</td>
				<td>클릭</td>
			</tr>
		</table>
	</div>
</body>
</html>