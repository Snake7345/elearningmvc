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
 
<c:url var="addCategoriemodule" value="/categoriemodule/add" ></c:url>
<form:form action="${addCategoriemodule}" modelAttribute="categoriemodule">
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
					value="<spring:message text="Add Categoriemodule"/>" />
			</td>
			</tr>
		</table>
		
		<table border="1">
		<tr>
		<th> CategorieModule Id </th>
		<th> Denomination </th>
		</tr>
		
		<c:if test="${!empty categoriemoduleList}">
			<c:forEach items="${categoriemoduleList}" var="categoriemodule">
			<tr>
			<td>${categoriemodule.idCatModule}</td>
			<td>${categoriemodule.denomination}</td>
			<td><a href="<c:url value='/deleteCategoriemodule/${categoriemodule.idCatModule}' />" >Delete</a></td>
			<td><a href="<c:url value='/editCategoriemodule/${categoriemodule.idCatModule}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</form:form>
 
 
</body>
</html>