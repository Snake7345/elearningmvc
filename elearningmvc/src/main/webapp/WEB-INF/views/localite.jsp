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
 
<c:url var="addLocalite" value="/localite/add" ></c:url>
<form:form action="${addLocalite }" commandName="localite">
<table>
			<tr>
			<td><form:label path="localiteName">
						<spring:message text="Localite Name" />
					</form:label></td>
					<td>
			<form:input path="localiteName"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="localiteContact">
						<spring:message text="Localite Contact" />
					</form:label></td>
					<td>
			<form:input path="localiteContact" type="text"/></td>
			<td>
			</tr>
			
			<tr>
			<td>
			<input type="submit"
					value="<spring:message text="Add Person"/>" />
			</td>
			</tr>
		</table>
		
		<table border="1">
		<tr>
		<th> Localite Id </th>
		<th> Localite Name </th>
		<th> Localite Contact </th>
		<th> Operation </th>
		</tr>
		
		<c:if test="${!empty localiteList}">
			<c:forEach items="${localiteList}" var="localite">
			<tr>
			<td>${localite.id }</td>
			<td>${localite.localiteName }</td>
			<td>${localite.localiteContact }</td>
			<td><a href="<c:url value='/deleteEmployee/${localite.id}' />" >Delete</a></td>
			<td><a href="<c:url value='/editEmployee/${localite.id}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</form:form>
 
 
</body>
</html>