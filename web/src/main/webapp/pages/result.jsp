<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2018/7/26
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>价格</th>
        <th>页数</th>
        <th>分类</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.books}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.price}</td>
            <td>${book.pnum}</td>
            <td>${book.category}</td>
        </tr>


    </c:forEach>


    </tbody>

</table>

</body>
</html>
