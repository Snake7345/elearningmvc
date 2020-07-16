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
 
<c:url var="addChapitre_formatchapitre" value="/chapitre_formatchapitre/add" ></c:url>
<form:form action="${addChapitre_formatchapitre}" modelAttribute="chapitre_formatchapitre">
<table>
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
			<td>${localite.idLocalite }</td>
			<td>${localite.ville }</td>
			<td>${localite.CP }</td>
			<td><a href="<c:url value='/deleteLocalite/${localite.idLocalite}' />" >Delete</a></td>
			<td><a href="<c:url value='/editLocalite/${localite.idLocalite}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</form:form>
 
 
</body>
</html>