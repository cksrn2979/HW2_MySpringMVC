<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>Insert title here</title>
</head>
<body>

	Create Success
	<table cellspacing="1" cellpadding="3" border="0" bgcolor="#737373"
		valign="top">
		<tr>
			<td bgcolor="#D0D8FF" width="80" align="center">과목코드</td>
			<td bgcolor="#D0D8FF" width="300" align="center">과목명</td>
			<td bgcolor="#D0D8FF" width="80" align="center">구분</td>
			<td bgcolor="#D0D8FF" width="50" align="center">학점</td>
		</tr>

		<tr>
			<td bgcolor="#F5F5F5" align="center">${preferSubject.subjectcode}</td>
			<td bgcolor="#F5F5F5" align="center">${preferSubject.subjectname}</td>
			<td bgcolor="#F5F5F5" align="center">${preferSubject.division}</td>
			<td bgcolor="#F5F5F5" align="center">${preferSubject.credit}</td>
		</tr>

	</table>

	<p>
		<a href="${pageContext.request.contextPath}/showPreferSubjects">
			모든 선호 교과목 수강 신청 조회</a>
	</p>
	
	<p>
		<a href="${pageContext.request.contextPath}">Home</a>
	</p>
</body>
</html>