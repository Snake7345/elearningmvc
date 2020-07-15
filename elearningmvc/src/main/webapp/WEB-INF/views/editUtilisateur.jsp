<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Utilisateur edit</title>
</head>
<body>
<c:url var="updateUtilisateur" value='/utilisateur/update' />
<form:form action="${updateUtilisateur}" modelAttribute="utilisateur">
<table>
 
			<tr>
			<td><form:label path="nom">
						<spring:message text="nom" />
					</form:label></td>
					<td>
			<form:input path="nom"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="prenom">
						<spring:message text="prenom" />
					</form:label></td>
					<td>
			<form:input path="prenom"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="adresse">
						<spring:message text="adresse" />
					</form:label></td>
					<td>
			<form:input path="adresse"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="login">
						<spring:message text="login" />
					</form:label></td>
					<td>
			<form:input path="login"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="password">
						<spring:message text="password" />
					</form:label></td>
					<td>
			<form:input path="password"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="profession">
						<spring:message text="profession" />
					</form:label></td>
					<td>
			<form:input path="profession"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="mobile">
						<spring:message text="mobile" />
					</form:label></td>
					<td>
			<form:input path="mobile"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="email">
						<spring:message text="email" />
					</form:label></td>
					<td>
			<form:input path="email"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><form:label path="localite.ville">
						<spring:message text="localite" />
					</form:label></td>
					<td>
			<form:input path="localite.ville" type="text"/></td>
			<td>
			</tr>
			
			<tr>
			<td><form:label path="role.denomination">
						<spring:message text="role" />
					</form:label></td>
					<td>
			<form:input path="role.denomination" type="text"/></td>
			<td>
			</tr>
			
			<tr>
			<td>
			<input type="submit"
					value="<spring:message text="Add Utilisateur"/>" />
			</td>
			</tr>
		</table>
		</form:form>
</body>
</html>