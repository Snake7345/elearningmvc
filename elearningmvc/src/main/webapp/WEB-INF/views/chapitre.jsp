<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chapitre Page</title>
</head>
<body>
 
<c:url var="addChapitre" value="/chapitre/add" ></c:url>
<form:form action="${addChapitre}" modelAttribute="chapitre">
<table>
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
					value="<spring:message text="Add Person"/>" />
			</td>
			</tr>
		</table>
		
		<table border="1">
		<tr>
		<th> Chapitre Id </th>
		<th> Chapitre Intitule </th>
		<th> Chapitre cotation </th>
		<th> Quizz</th>
		<th> Emplacement</th>
		<th> moduleIdModule</th>
		</tr>
		
		<c:if test="${!empty chapitreList}">
			<c:forEach items="${chapitreList}" var="chapitre">
			<tr>
			<td>${chapitre.idChapitre}</td>
			<td>${chapitre.intitule}</td>
			<td>${chapitre.cotation}</td>
			<td>${chapitre.quizz}</td>
			<td>${chapitre.emplacement}</td>
			<td>${chapitre.module.intitule}</td>
			<td><a href="<c:url value='/deleteChapitre/${chapitre.idChapitre}' />" >Delete</a></td>
			<td><a href="<c:url value='/editChapitre/${chapitre.idChapitre}' />" >Edit</a></td>
			</tr>
			</c:forEach>
		</c:if>
		</table>
</form:form>
 
 
</body>
</html>