<%--
  Created by IntelliJ IDEA.
  User: cooki
  Date: 2024-08-01
  Time: 오후 4:46
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
        width: 50px;
    }
</style>

  <h1>${memberInfo} 님의 마이페이지</h1>

  <ul>
      <c:forEach items="${cart}" var="item">
          <li>
            <img class="pic" src="/img/${item}">
          </li>
      </c:forEach>
  </ul>


</body>
</html>
