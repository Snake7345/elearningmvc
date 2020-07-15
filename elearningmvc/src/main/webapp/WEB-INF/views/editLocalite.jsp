<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<c:url var="updateLocalite" value='/localite/update' />
<form:form action="${updateLocalite}" modelAttribute="localite">
<table>
 
			<tr>
			<td><form:label path="idLocalite">
						<spring:message text="idLocalite" />
					</form:label></td>
					<td>
			<form:input path="idLocalite"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="ville">
						<spring:message text="ville" />
					</form:label></td>
					<td>
			<form:input path="ville"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="CP">
						<spring:message text="CP" />
					</form:label></td>
					<td>
			<form:input path="CP" type="text"/></td>
			<td>
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