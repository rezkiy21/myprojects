<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
<%=request.getSession().getAttribute("currentUser")%>
<div></div>
<a href="${pageContext.request.contextPath}/new.jsp"><button>Registration</button></a>
<div></div>
<a href="${pageContext.request.contextPath}/auth"><button>Auth</button></a>
</body>
</html>
