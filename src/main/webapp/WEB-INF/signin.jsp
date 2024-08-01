<%--
  Created by IntelliJ IDEA.
  User: cooki
  Date: 2024-08-01
  Time: 오후 3:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Signin Page</h1>
  <form action="/signin" method="post">
      <div>
          UID
          <input type="text" name="uid">
      </div>
      <div>
          UPW
          <input type="text" name="upw">
      </div>
      <div>
          <button>Signin</button>
      </div>
  </form>
</body>
</html>
