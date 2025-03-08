<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>	
<body bgcolor="lavender">
<center>
<h1>ZEE-ZEE Web Portal</h1>
</center>
<center>
<form action="submitlogin" method="post">
        <label for="userName">UserName:</label>
        <input type="text" name="userName" id="userName" required/><br>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required/><br>
        <input type="submit" name="submit" value="Login" />
        <input type="reset" name="Cancel" value="Cancel" />
 </form>
</center>

</body>
</html>