<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MaYunpeng
  Date: 2016/8/31
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>shop</title>
</head>
<body>
<table>
<thead>
<th>
  <td>编号</td>
  <td>名称</td>
</th>
</thead>
<tbody>
<c:forEach items="${pageObj}" var="shop">
<tr>
  <td>${shop.shopId}</td>
  <td>${shop.shopName}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>
