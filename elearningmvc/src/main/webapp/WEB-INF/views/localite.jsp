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
<jsp:include page="../Templates/header.jsp"></jsp:include>
</head>
<body>
 
<c:url var="addLocalite" value="/localite/add" ></c:url>
<sf:form action="${addLocalite}" modelAttribute="localite">
<table>
			<tr>
			<td><sf:label path="ville">
						<spring:message text="ville" />
					</sf:label></td>
					<td>
			<sf:input path="ville"  type="text"/></td>
			
			</tr>
			
			<tr>
			<td><sf:label path="CP">
						<spring:message text="CP" />
					</sf:label></td>
					<td>
			<sf:input path="CP" type="text"/></td>
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
</sf:form>
 
 
</body>
<jsp:include page="../Templates/footer.jsp"></jsp:include>
</html>