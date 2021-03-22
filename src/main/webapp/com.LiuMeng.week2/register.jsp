<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/3/15
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<form method="post" action="register">
    NEW USER REGISTRATION<br/>
    <label for="Username">USERNAME</label><br/>
    <input type="text" name="Username" id="Username" placeholder="Please input username" required autofocus><br/>

    <label for="Password">PASSWORD</label><br/>
    <input type="password" name="Password" id="Password" placeholder="Please input password" required autofocus minlength="8"><br/>

    <label for="Email">EMAIL</label><br/>
    <input type="email" name="Email" id="Email" placeholder="Please input Email" required autofocus><br/>


    <input type="radio" name="sex" value="Male" checked/>Male

    <input type="radio" name="sex" value="Female" checked/>Female<br/>

    <label for="BirthDate">BIRTHDATE</label><br/>
    <input type="date" name="BirthDate" id="BirthDate" placeholder="Day of Birth (yyyy-mm-dd)" ><br/>

    <input type="submit" value="Register" style="background: darkgrey;"/><br/>

</form>
</body>
</html>
