<%@ page import="com.LiuMeng.model.User" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/4/9
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Info</h1>
<%
    User u=(User)session.getAttribute("user");
%>
<table>
    <tr><td>Username:</td><td><%=u.getUsername()%></td></tr>
    <tr><td>Password:</td><td><%=u.getPassword()%></td></tr>
    <tr><td>email:</td><td><%=u.getEmail()%></td></tr>
    <tr><td>Gender:</td><td><%=u.getGender()%></td></tr>
    <tr><td>Birth Date:</td><td><%=u.getBirthdate()%></td></tr>
    <tr><a href="updateUser">Update User</a></tr>
</table>
<%@include file="footer.jsp"%>