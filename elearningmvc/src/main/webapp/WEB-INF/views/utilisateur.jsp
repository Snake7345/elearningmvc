<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Utilisateur Page</title>
</head>
<body>
 
<c:url var="addUtilisateur" value="/utilisateur/add" ></c:url>
<form:form action="${addUtilisateur}" modelAttribute="utilisateur">
<table>
			<tr>
			<td><form:label path="nom">
						<spring:message text="nom" />
					</form:label></td>
					<td>
			<form:input path="nom"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="localite_idLocalite">
						<spring:message text="localite_idLocalite" />
					</form:label></td>
					<td>
			<form:input path="localite_idLocalite" type="text"/></td>
			<td>
			</tr>
			
			<tr>
			<td>
			<input type="submit"
					value="<spring:message text="Add Utilisateur"/>" />
			</td>
			</tr>
		</table>
		
		<table border="1">
		<tr>
		<th> nom</th>
		<th> localite </th>
		</tr>
		
		<c:if test="${!empty utilisateurList}">
			<c:forEach items="${utilisateurList}" var="utilisateur">
			<tr>
			<td>${utilisateur.nom }</td>
			<td>${utilisateur.localite.idLocalite }</td>
			<td><a href="<c:url value='/deleteUtilisateur/${utilisateur.idUtilisateur}' />" >Delete</a></td>
			<td><a href="<c:url value='/editUtilisateur/${utilisateur.idUtilisateur}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</form:form>
 
 
</body>
</html>