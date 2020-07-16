<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chapitre edit</title>
</head>
<body>
<c:url var="updateChapitre" value='/chapitre/update' />
<form:form action="${updateChapitre}" modelAttribute="chapitre">
<table>
 
			<tr>
			<td><form:label path="idChapitre">
						<spring:message text="idChapitre" />
					</form:label></td>
					<td>
			<form:input path="idChapitre"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="intitule">
						<spring:message text="intitule" />
					</form:label></td>
					<td>
			<form:input path="intitule"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="cotation">
						<spring:message text="cotation" />
					</form:label></td>
					<td>
			<form:input path="cotation" type="text"/></td>
			<td>
			</tr>
			
			<tr>
			<td><form:label path="quizz">
						<spring:message text="quizz" />
					</form:label></td>
					<td>
			<form:input path="quizz" type="text"/></td>
			<td>
			</tr>
			
			<tr>
			<td><form:label path="emplacement">
						<spring:message text="emplacement" />
					</form:label></td>
					<td>
			<form:input path="emplacement" type="text"/></td>
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