<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Page</title>
</head>
<body>
 
<c:url var="addRole" value="/role/add" ></c:url>
<form:form action="${addRole}" modelAttribute="role">
<table>
			<tr>
			<td><form:label path="denomination">
						<spring:message text="denomination" />
					</form:label></td>
					<td>
			<form:input path="denomination"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td>
			<input type="submit"
					value="<spring:message text="Add Role"/>" />
			</td>
			</tr>
		</table>
		
		<table border="1">
		<tr>
		<th> Role ID </th>
		<th> Denomination</th>
		</tr>
		
		<c:if test="${!empty roleList}">
			<c:forEach items="${roleList}" var="role">
			<tr>
			<td>${role.idRole}</td>
			<td>${role.denomination}</td>
			<td><a href="<c:url value='/deleteRole/${role.idRole}' />" >Delete</a></td>
			<td><a href="<c:url value='/editRole/${role.idRole}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</form:form>
 
 
</body>
</html>