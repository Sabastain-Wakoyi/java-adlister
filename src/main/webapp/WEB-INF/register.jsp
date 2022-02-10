<%--
  Created by IntelliJ IDEA.
  User: jevian
  Date: 2/10/22
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
      <jsp:param name="title" value="Registration"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp">
<div class="container">
  <h3>Fill in Your Details</h3>
  <form action="/registration" method="post">
    <div class="form-group">
        <label for="username">Uername</label>
        <input id="username" name="username" class="form-control" type="text">
    </div>
      <div class="form-group">
          <label for="email">Email</label>
          <input id="email" name="email" class="form-control" type="text">
      </div>
      <div class="form-group">
          <label for="password">Password</label>
          <input id="password" name="password" class="form-control" type="password">
      </div>
      <div class="form-group">
          <label for="confirm_password">Confirm Password</label>
          <input id="confirm_password" name="confirm_password" class="form-control" type="password">
      </div>
  </form>
</div>
</body>
</jsp:include>
</html>