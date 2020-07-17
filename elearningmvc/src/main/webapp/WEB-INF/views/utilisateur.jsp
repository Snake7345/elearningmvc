<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Utilisateur Page</title>
</head>
<body>
 
<c:url var="addUtilisateur" value="/utilisateur/add" ></c:url>
<sf:form action="${addUtilisateur}" modelAttribute="utilisateur">
<table>
			<tr>
			<td><sf:label path="nom">
						<spring:message text="nom" />
					</sf:label></td>
					<td>
			<sf:input path="nom"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><sf:label path="prenom">
						<spring:message text="prenom" />
					</sf:label></td>
					<td>
			<sf:input path="prenom"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><sf:label path="adresse">
						<spring:message text="adresse" />
					</sf:label></td>
					<td>
			<sf:input path="adresse"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><sf:label path="login">
						<spring:message text="login" />
					</sf:label></td>
					<td>
			<sf:input path="login"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><sf:label path="password">
						<spring:message text="password" />
					</sf:label></td>
					<td>
			<sf:input path="password"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><sf:label path="profession">
						<spring:message text="profession" />
					</sf:label></td>
					<td>
			<sf:input path="profession"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><sf:label path="mobile">
						<spring:message text="mobile" />
					</sf:label></td>
					<td>
			<sf:input path="mobile"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><sf:label path="email">
						<spring:message text="email" />
					</sf:label></td>
					<td>
			<sf:input path="email"  type="text"/></td>
			
			</tr>
			<!-- 
			<tr>
			<td><form:label path="localite.ville">
						<spring:message text="localite.ville" />
					</form:label></td>
					<td>
			<form:input path="localite.ville" name="ville" type="text"/></td>
			<td>
			</tr>
			 -->
			<tr>
			<td>
			<sf:label path="localite.ville"><spring:message text="localite.ville" />
					</sf:label>
			</td>
			<td>
			<sf:select path="localite.ville" items="${localiteList}" itemLabel="ville" itemValue="ville">
			</sf:select>
			</td>
			</tr>
			
			<tr>
			<td>
			<sf:label path="role.denomination"><spring:message text="role.denomination" />
					</sf:label>
			</td>
			<td>
			<sf:select path="role.denomination" items="${roleList}" itemLabel="denomination" itemValue="denomination">
			</sf:select>
			</td>
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
		<th> prenom </th>
		<th> adresse</th>
		<th> login </th>
		<th> password</th>
		<th> profession </th>
		<th> mobile</th>
		<th> email </th>
		<th> ville</th>
		<th> role </th>
		</tr>
		
		<c:if test="${!empty utilisateurList}">
			<c:forEach items="${utilisateurList}" var="utilisateur">
			<tr>
			<td>${utilisateur.nom}</td>
			<td>${utilisateur.prenom}</td>
			<td>${utilisateur.adresse}</td>
			<td>${utilisateur.login}</td>
			<td>${utilisateur.password}</td>
			<td>${utilisateur.profession}</td>
			<td>${utilisateur.mobile}</td>
			<td>${utilisateur.email}</td>
			<td>${utilisateur.localite.ville}</td>
			<td>${utilisateur.role.denomination}</td>
			<td><a href="<c:url value='/deleteUtilisateur/${utilisateur.idUtilisateur}' />" >Delete</a></td>
			<td><a href="<c:url value='/editUtilisateur/${utilisateur.idUtilisateur}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</sf:form>
 
 
</body>
</html>