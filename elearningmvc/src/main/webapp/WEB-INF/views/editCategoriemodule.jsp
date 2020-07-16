<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Categoriemodule edit</title>
</head>
<body>
<c:url var="updateCategoriemodule" value='/categoriemodule/update' />
<form:form action="${updateCategoriemodule}" modelAttribute="categoriemodule">
<table>
 
			<tr>
			<td><form:label path="idCatModule">
						<spring:message text="idCatModule" />
					</form:label></td>
					<td>
			<form:input path="idCatModule"  type="text"/></td>
			
			</tr>
			
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
					value="<spring:message text="Update CP"/>" />
			</td>
			</tr>
		</table>
		</form:form>
</body>
</html>