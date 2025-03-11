<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color:lavender">
<h1><center> Welcome to Online Help Services </center></h1>
<form:form method="post" action="register" modelAttribute="register">
<table style="margin: 0px auto; margin-left: auto; margin-right:auto">
            <tr>
                <td>UserName:</td>
                <td><form:input path="userName" name="userName"/></td>
                <td><form:errors path="userName" /></td>
            </tr>

            <tr>
                <td>Contact Number:</td>
                <td><form:input path="contactNumber" name="contactNumber"/></td>
                <td><form:errors path="contactNumber" /></td>
            </tr>

            <tr>
                <td>Email Id:</td>
                <td><form:input path="emailId" name="emailId"/></td>
                <td><form:errors path="emailId" /></td>
            </tr>

            <tr>
                <td>Confirm Email Id:</td>
                <td><form:input path="confirmEmailId" name="confirmEmailId" /></td>
                <td><form:errors path="confirmEmailId" /></td>
            </tr>

            <tr>
                <td><input type="checkbox" name="status" id="status" /></td>
                <td><form:errors path="status" /></td>
            </tr>

            <tr>
                <td><input type="submit" name="submit" value="Register"/>
                <td><input type="reset" value="Cancel" /></td>
            </tr>
</table>
</form:form>
</body>
</html>