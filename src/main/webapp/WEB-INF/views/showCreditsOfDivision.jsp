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

	구분별 이수 학점 조회

	<table width="460" cellspacing="1" cellpadding="3" border="0"
		bgcolor="#737373" valign="top">
		<tr>

			<td bgcolor="#D0D8FF" width="40" align="center">교필</td>
			<td bgcolor="#D0D8FF" width="50" align="center">토대</td>
			<td bgcolor="#D0D8FF" width="50" align="center">인재</td>
			<td bgcolor="#D0D8FF" width="50" align="center">자율</td>
			<td bgcolor="#D0D8FF" width="50" align="center">전기</td>
			<td bgcolor="#D0D8FF" width="50" align="center">전지</td>
			<td bgcolor="#D0D8FF" width="50" align="center">전선</td>
			<td bgcolor="#D0D8FF" width="50" align="center">총학점</td>
		</tr>
		<tr>

			<td bgcolor="#F5F5F5" align="center">${credits_kyopil}</td>
			<td bgcolor="#F5F5F5" align="center">${credits_todae}</td>
			<td bgcolor="#F5F5F5" align="center">${credits_injae}</td>
			<td bgcolor="#F5F5F5" align="center">${credits_zayoul}</td>

			<td bgcolor="#F5F5F5" align="center">${credits_jungi}</td>
			<td bgcolor="#F5F5F5" align="center">${credits_junzi}</td>
			<td bgcolor="#F5F5F5" align="center">${credits_junsun}</td>
			<td bgcolor="#F5F5F5" align="center">${allCredits}</td>
		</tr>

	</table>
</body>
</html>
