<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>new</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/new.jsp" method="post">
    <input type="text" name="name">
    <input type="text" name="age">
    <input type="text" name="login">
    <input type="text" name="pass">
    <button type="submit">Зарегистрироваться</button>

</form>
Вы зарегистрированы <%=request.getAttribute("login")%>
<div></div>
<a href="${pageContext.request.contextPath}/auth"><button>Авторизация</button></a>
<div></div>
<a href="${pageContext.request.contextPath}/main"><button>На главную</button></a>
</body>
</html>
