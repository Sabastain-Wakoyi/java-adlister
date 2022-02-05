<%--
  Created by IntelliJ IDEA.
  User: jevian
  Date: 2/4/22
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--    <%@include file="partials/head.jsp"%>--%>
    <title>Guess a number</title>
</head>
<body>
<%--    <div class="container">--%>
<%--    <%@include file="partials/correct.jsp"%>--%>
<%--    </div>--%>
<%--    <div class="container">--%>
<%--    <%@include file="partials/incorrect.jsp"%>--%>
<%--    </div>--%>
<%--    --%>

    <h3> Choose a number</h3>
<form action="/guess" method="post">
    <button name="guess" value="1">1</button>
    <button name="guess" value="2">1</button>
    <button name="guess" value="3">1</button>

</form>
</body>
</html>