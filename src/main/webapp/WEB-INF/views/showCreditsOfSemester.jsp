<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<body>

	학기별 이수 학점 조회
	
	<table cellspacing="1" cellpadding="3" border="0" bgcolor="#737373"
		valign="top">
		<tr>
			<td bgcolor="#D0D8FF" width="70" align="center">년도</td>
			<td bgcolor="#D0D8FF" width="50" align="center">학기</td>
			<td bgcolor="#D0D8FF" width="50" align="center">이수학점</td>
			<td bgcolor="#D0D8FF" width="80" align="center">상세보기</td>
		</tr>

		<c:forEach var="credits" items="${creditsList}">
			<c:set var="year" value="${credits.year}" />
			<c:set var="semester" value="${credits.semester}" />
			<c:set var="credits" value="${credits.credit}" />
			<tr>
				<td bgcolor="#F5F5F5" align="center">${year}</td>
				<td bgcolor="#F5F5F5" align="center">${semester}</td>
				<td bgcolor="#F5F5F5" align="center">${credits}</td>
				<td bgcolor="#F5F5F5" align="center"><a
					href="${pageContext.request.contextPath}/showSubjectsOfSemester?year=${year}&semester=${semester}">
						<img
						src="${pageContext.request.contextPath}/resources/images/btnDetail.gif" />
				</a></td>
			</tr>

		</c:forEach>



	</table>

</body>
</html>