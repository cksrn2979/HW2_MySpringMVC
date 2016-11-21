<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
</head>
<style>
div.ex {
	width: 25%;
	padding: 10px;
	border: 5px solid grey;
	margin: 20px
}

p, a, ul, li, td, h1, h2, h3 {
	font-size: 15px;
}
</style>
<body>
	<h1>나의 학적 조회</h1>

	<div class="ex">
		<table>
			<tr>
				<td><a
					href="${pageContext.request.contextPath}/showCreditsOfSemester">학기별
						이수 학점 조회</a></td>
			</tr>
			<tr>
				<td><a
					href="${pageContext.request.contextPath}/showCreditsOfDivision">이수
						구분별 학점 조회</a></td>
			</tr>
			<tr>
				<td>수강 신청하기</td>
			</tr>
			<tr>
				<td>수강 신청 조회</td>
			</tr>
		</table>
	</div>
</body>
</html>
