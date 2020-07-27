<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Page</title>
</head>
<body>
 
<c:url var="addModule" value="/modulee/add" ></c:url>
<sf:form action="${addModule}" modelAttribute="module">
<table>
			<tr>
			<td><sf:label path="intitule">
						<spring:message text="intitule" />
					</sf:label></td>
					<td>
			<sf:input path="intitule"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><sf:label path="actif">
						<spring:message text="actif" />
					</sf:label></td>
					<td>
			<sf:input path="actif" type="text"/></td>
			<td>
			</tr>
			
			<tr>
			<td><sf:label path="categoriemodule.denomination">
						<spring:message text="categoriemodule.denomination" />
					</sf:label></td>
					<td>
			<sf:select path="categoriemodule.idCatModule" items="${categoriemoduleList}" itemLabel="denomination" itemValue="idCatModule">
			</sf:select>
			</td>
			</tr>
			
			<tr>
			<td>
			<input type="submit"
					value="<spring:message text="Add Module"/>" />
			</td>
			</tr>
		</table>
		
		<table border="1">
		<tr>
		<th> Module Id </th>
		<th> Module Name </th>
		<th> Actif </th>
		<th> Categorie module </th>
		</tr>
		
		<c:if test="${!empty categoriemoduleList}">
			<c:forEach items="${categoriemoduleList}" var="module">
			<tr>
			<td>${module.idModule }</td>
			<td>${module.intitule }</td>
			<td>${module.actif }</td>
			<td>${module.categoriemodule.denomination }</td>
			<td><a href="<c:url value='/deleteModule/${module.idModule}' />" >Delete</a></td>
			<td><a href="<c:url value='/editModule/${module.idModule}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</sf:form>
 
 
</body>
</html>