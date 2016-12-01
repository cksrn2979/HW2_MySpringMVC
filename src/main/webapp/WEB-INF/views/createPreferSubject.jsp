<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<head>
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<body>
	<form:form class="mainform" method="get"
		action="${pageContext.request.contextPath}/doCreatePreferSubject"
		modelAttribute="preferSubject">
		<h3>선호 과목 사전 수강신청</h3>
		<table>
			<tr>
				<td>과목코드</td>
				<td><form:input class="et_text" type="text" path="subjectcode" /></td>
			<tr>
			
			<tr>
				<td></td>
				<td><form:errors class="error" path="subjectcode"></form:errors></td>
			</tr>
			
			<tr>
				<td>과목명</td>
				<td><form:input class="et_text" type="text" path="subjectname" /></td>
			<tr>
			
			<tr>
				<td></td>
				<td><form:errors class="error" path="subjectname"></form:errors></td>
			</tr>

			<tr>
				<td>구분</td>
				<td><form:input class="et_text" type="text" path="division" /></td>
			<tr>
			
			<tr>
				<td></td>
				<td><form:errors class="error" path="division"></form:errors></td>
			</tr>

			<tr>
				<td>학점</td>
				<td><form:input class="et_text" type="number" path="credit" /></td>
			<tr>
			
			<tr>		
				<td></td>
				<td><form:errors class="error" path="credit"></form:errors></td>
			</tr>

			<tr>
				<td></td>
				<td><input class="btn_submit" type="submit" value="add subject" /></td>
			<tr>
		</table>
	</form:form>
</body>
</html>