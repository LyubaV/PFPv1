<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:jsp="http://java.sun.com/JSP/Page"
      xmlns:c="http://java.sun.com/jsp/jstl/core">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
</head>


<body>
<form action="<c:url value='/exitUser.jsp'/>"  method="POST">
    <input  name="Logout" type="submit" value="log out"/>
</form>

<h3>
    Locale: <spring:message code="error.test_message" text="default text" />
</h3>

Current Locale : ${pageContext.response.locale}<br>


Typical JavaBean: <br>
<c:forEach var="val" items="${acc.getAccounts()}">
    <jsp:text>${val} </jsp:text>
    <br>
</c:forEach>
Formatted date: <c:out value="${date}"/> <br>

RequestScope: <br>
<c:forEach var="val" items="${requestScope}">
    <jsp:text>${val.key} - ${val.value}</jsp:text>
    <br>
</c:forEach>




</body>
</html>
