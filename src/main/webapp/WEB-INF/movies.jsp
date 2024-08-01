<%--
  Created by IntelliJ IDEA.
  User: cooki
  Date: 2024-08-01
  Time: 오후 3:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<style>
  .pic {
    width: 200px;
  }
</style>

<form action="/buy" method="post">
<ul>
  <c:forEach items="${movies}" var="movie">
    <li>
      <img class="pic" src="/img/${movie}">
      <input type="checkbox" name="item" value="${movie}" >${movie}
    </li>
  </c:forEach>
</ul>
<button>BUY</button>
</form>

</body>
</html>
