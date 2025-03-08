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
                <td>Name:</td>
                <td><form:input path="userName" /></td>
                <td><form:errors path="userName" style="color:red;" /></td>
            </tr>

            <tr>
                <td>Contact Number:</td>
                <td><form:input path="contactNumber" /></td>
                <td><form:errors path="contactNumber" style="color:red;" /></td>
            </tr>

            <tr>
                <td>Email:</td>
                <td><form:input path="emailId" /></td>
                <td><form:errors path="emailId" style="color:red;" /></td>
            </tr>

            <tr>
                <td>Confirm Email:</td>
                <td><form:input path="confirmEmailId" /></td>
                <td><form:errors path="confirmEmailId" style="color:red;" /></td>
            </tr>

            <tr>
                <td>Agree to terms:</td>
                <td><form:checkbox path="status" /></td>
                <td><form:errors path="status" style="color:red;" /></td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Register" />
                </td>
            </tr>
</table>
</form:form>
</body>
</html>