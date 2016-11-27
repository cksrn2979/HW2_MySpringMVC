<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<body>

	<font color="Marloon">구분별 학점 이수 조회</font>
	<table width="460"  cellspacing="1" cellpadding="3" border="0" bgcolor="#737373"  valign="top">
		<tr>

			<td bgcolor="#D0D8FF" width="40" align="center">교필</td>
			<td bgcolor="#D0D8FF" width="50" align="center">토대</td>
			<td bgcolor="#D0D8FF" width="50" align="center">인재</td>
			<td bgcolor="#D0D8FF" width="50" align="center">전기</td>
			<td bgcolor="#D0D8FF" width="50" align="center">전지</td>
			<td bgcolor="#D0D8FF" width="50" align="center">전선</td>
		</tr>
		<tr>

			<td bgcolor="#F5F5F5" align="center">${credits_basicliberalart}</td>
			<td bgcolor="#F5F5F5" align="center">${credits_liberalartA}</td>
			<td bgcolor="#F5F5F5" align="center">${credits_liberalartB}</td>
			<td bgcolor="#F5F5F5" align="center">${credits_basicMajor}</td>
			<td bgcolor="#F5F5F5" align="center">${credits_appointMajor}</td>
			<td bgcolor="#F5F5F5" align="center">${credits_selectMajor}</td>
		</tr>


	</table>
</body>
</html>
