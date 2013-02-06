<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:jsp="http://java.sun.com/JSP/Page"
      xmlns:c="http://java.sun.com/jsp/jstl/core">
<head>
    <title></title>
</head>
Атрибуты HTTPServletRequest:<br>
<%
    String attr;
    for (Enumeration e = request.getAttributeNames(); e.hasMoreElements(); ) {
        attr = (String)(e.nextElement());
        %>
        <%= attr%> - <%= request.getAttribute(attr).toString()%>
        <br>
        <%
    }
%>

<c:forEach var="counter" begin="1" end="${requestScope.acc.getAccounts().size()}">
    <jsp:text>${requestScope.acc.getAccounts().get(counter-1)}</jsp:text>
    <br>
</c:forEach>


<body>
</body>
</html>
