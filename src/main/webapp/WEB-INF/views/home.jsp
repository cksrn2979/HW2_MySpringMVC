<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
</head>

<body>
	<table class="hometable">
		<tr>
			<td><a href="${pageContext.request.contextPath}/showCreditsOfSemester">학기별 이수 학점 조회 </a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/showCreditsOfDivision">구분별 이수 학점 조회 </a></td>
		</tr>
		<tr>			
			<td><a href="${pageContext.request.contextPath}/createPreferSubject">선호 교과목 사전 수강 신청하기</a>
			</td>
		</tr>
		
		<tr>
			<td><a href="${pageContext.request.contextPath}/showPreferSubjects">선호 교과목 수강 신청 조회</a></td>
		</tr>
	</table>
</body>
</html>
