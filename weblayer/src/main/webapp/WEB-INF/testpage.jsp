<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:jsp="http://java.sun.com/JSP/Page"
      xmlns:c="http://java.sun.com/jsp/jstl/core">
<head>
    <title></title>
</head>


<body>
<form:form action="<c:url value='j_spring_security_exit_user'/>"  method="POST">
    <input  name="Logout" type="submit" value="log out"/>
</form:form>

Typical JavaBean: <br>
<c:forEach var="val" items="${requestScope.acc.getAccounts()}">
    <jsp:text>${val} </jsp:text>
    <br>
</c:forEach>

RequestScope: <br>
<c:forEach var="val" items="${requestScope}">
    <jsp:text>${val.key} - ${val.value}</jsp:text>
    <br>
</c:forEach>




</body>
</html>
