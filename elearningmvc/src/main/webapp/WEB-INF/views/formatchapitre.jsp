<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Page</title>
</head>
<jsp:include page="../Templates/header.jsp"></jsp:include>
<body>
 
<c:url var="addFormatchapitre" value="/formatchapitre/add" ></c:url>
<sf:form action="${addFormatchapitre}" modelAttribute="formatchapitre">
<table>
			<tr>
			<td><sf:label path="typeFormat">
						<spring:message text="typeFormat" />
					</sf:label></td>
					<td>
			<sf:input path="typeFormat"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td>
			<input type="submit"
					value="<spring:message text="Add TypeFormat"/>" />
			</td>
			</tr>
		</table>
		
		<table border="1">
		<tr>
		<th> FormatChapitre Id </th>
		<th> FormatChapitre Intitule </th>
		</tr>
		
		<c:if test="${!empty formatchapitreList}">
			<c:forEach items="${formatchapitreList}" var="formatchapitre">
			<tr>
			<td>${formatchapitre.idFormatChapitre }</td>
			<td>${formatchapitre.typeFormat }</td>
			<td><a href="<c:url value='/deleteFormatchapitre/${formatchapitre.idFormatChapitre}' />" >Delete</a></td>
			<td><a href="<c:url value='/editFormatchapitre/${formatchapitre.idFormatChapitre}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</sf:form>
 
 
</body>
<jsp:include page="../Templates/footer.jsp"></jsp:include>
</html>