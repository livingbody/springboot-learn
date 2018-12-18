<%@ page language="java" contentType="text/html' charset=UTF-8" pageEncoding="utf-8"/>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HI JSP, 现在时间是</title>
</head>
<body>


<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>username</td>
    </tr>
    <c:forEach items="${users}" var="s" varStatus="st">
        <tr>
            <td>${s.id}</td>
            <td>${s.username}</td>
        </tr>
    </c:forEach>
</table>
</body>

</html>

