<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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

	<h1>구분별 학점 이수 조회</h>
	<div class="ex">
		<table width="100%" cellpadding="5" cellspacing="0" border="0">
			<tr>
				<td>교필</td>
				<td>토대</td>
				<td>인재</td>
				<td>전기</td>
				<td>전지</td>
				<td>전선</td>
			</tr>

			<tr>
				<td>${credits_basicliberalart}</td>
				<td>${credits_liberalartA}</td>
				<td>${credits_liberalartB}</td>
				<td>${credits_basicMajor}</td>
				<td>${credits_appointMajor}</td>
				<td>${credits_selectMajor}</td>
			</tr>
		</table>
	</div>

</body>
</html>
