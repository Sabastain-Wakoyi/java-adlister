<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jevian
  Date: 2/5/22
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Results</title>
</head>
<body>
  <c:choose>
  <c:when test="${result}">
    <h3>Won the guessing </h3>
  </c:when>
  <c:otherwise>
    <h3>Lost the guessing</h3>
  </c:otherwise>
  </c:choose>
<a href="/guess">Start the Guessing Game</a>
</body>
</html>
