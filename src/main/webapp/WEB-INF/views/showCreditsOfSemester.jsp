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

	<font class="maintext">학기별 학점 이수 조회</font>
	<table cellspacing="1" cellpadding="3" border="0" bgcolor="#737373"  valign="top">
		<tr>
			<td bgcolor="#D0D8FF" width="70" align="center">년도</td>
			<td bgcolor="#D0D8FF" width="50" align="center">학기</td>
			<td bgcolor="#D0D8FF" width="50" align="center">이수학점</td>
			<td bgcolor="#D0D8FF" width="80" align="center">상세보기</td>
		</tr>
		
		
		<tr>
			<td bgcolor="#F5F5F5" align="center">2011</td>
			<td bgcolor="#F5F5F5" align="center">1</td>
			<td bgcolor="#F5F5F5" align="center">${credits2011_1}</td>
			<td bgcolor="#F5F5F5" align="center">
				<a href ="${pageContext.request.contextPath}/showSubjectsOfSemester?year=2011&semester=1">
					<img src="${pageContext.request.contextPath}/resources/images/btnDetail.gif" />
				</a>
			</td>
		</tr>
		
		<tr>
			<td bgcolor="#F5F5F5" align="center">2011</td>
			<td bgcolor="#F5F5F5" align="center">2</td>
			<td bgcolor="#F5F5F5" align="center">${credits2011_2}</td>
			<td bgcolor="#F5F5F5" align="center">
				<a href ="${pageContext.request.contextPath}/showSubjectsOfSemester?year=2011&semester=2">
					<img src="${pageContext.request.contextPath}/resources/images/btnDetail.gif" />
				</a>
			</td>
		</tr>
		
		<tr>
			<td bgcolor="#F5F5F5" align="center">2015</td>
			<td bgcolor="#F5F5F5" align="center">1</td>
			<td bgcolor="#F5F5F5" align="center">${credits2015_1}</td>
			<td bgcolor="#F5F5F5" align="center">
				<a href ="${pageContext.request.contextPath}/showSubjectsOfSemester?year=2015&semester=1">
					<img src="${pageContext.request.contextPath}/resources/images/btnDetail.gif" />
				</a>
			</td>
		</tr>
		
		<tr>
			<td bgcolor="#F5F5F5" align="center">2015</td>
			<td bgcolor="#F5F5F5" align="center">2</td>
			<td bgcolor="#F5F5F5" align="center">${credits2015_2}</td>
			<td bgcolor="#F5F5F5" align="center">
				<a href ="${pageContext.request.contextPath}/showSubjectsOfSemester?year=2015&semester=2">
					<img src="${pageContext.request.contextPath}/resources/images/btnDetail.gif" />
				</a>
			</td>
		</tr>
		
		<tr>
			<td bgcolor="#F5F5F5" align="center">2016</td>
			<td bgcolor="#F5F5F5" align="center">1</td>
			<td bgcolor="#F5F5F5" align="center">${credits2016_1}</td>
			<td bgcolor="#F5F5F5" align="center">
				<a href ="${pageContext.request.contextPath}/showSubjectsOfSemester?year=2016&semester=1">
					<img src="${pageContext.request.contextPath}/resources/images/btnDetail.gif" />
				</a>
			</td>
		</tr>
		
		<tr>
			<td bgcolor="#F5F5F5" align="center">2016</td>
			<td bgcolor="#F5F5F5" align="center">2</td>
			<td bgcolor="#F5F5F5" align="center">${credits2016_2}</td>
			<td bgcolor="#F5F5F5" align="center">
				<a href ="${pageContext.request.contextPath}/showSubjectsOfSemester?year=2016&semester=2">
					<img src="${pageContext.request.contextPath}/resources/images/btnDetail.gif" />
				</a>
			</td>
		</tr>


	</table>
	
</body>
</html>