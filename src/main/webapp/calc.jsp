<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/calc" method="post">
    <input type="text" name="act">
    <input type="text" name="num1">
    <input type="text" name="num2">
    <button type="submit">Submit</button>

</form>
Ваш результат <%=request.getParameter("result")%>
<div></div>
<a href="${pageContext.request.contextPath}/history"><button>История</button></a>
<div></div>
<a href="${pageContext.request.contextPath}/main"><button>На главную</button></a>
</body>
</html>
