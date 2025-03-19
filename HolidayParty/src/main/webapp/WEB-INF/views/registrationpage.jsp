<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color:lavender">
<h1><center> Welcome to Online Help Services </center></h1>
<form:form method="post" action="register" modelAttribute="register">
<table style="margin: 0px auto; margin-left: auto; margin-right:auto">
		               
	<tr>
	    <td><b>UserName:</b></td>
	    <td><input type="text" id="userName" name="userName"></td>
	    <td><form:errors path="userName" cssClass="error"></form:errors></td>
	</tr>
    
	<tr>
	    <td><b>Contact Number</b></td>
	    <td><input type="text" id="contactNumber" name="contactNumber"></td>
	    <td><form:errors path="contactNumber" cssClass="error"></form:errors></td>
	</tr>
    
	<tr>
	    <td><b>Email Id</b></td>
	    <td><input type="text" id="emailId" name="emailId"></td>
	    <td><form:errors path="emailId" cssClass="error"></form:errors></td>
	</tr>
    
	<tr>
	    <td><b>Confirm Email Id</b></td>
	    <td><input type="text" id="confirmEmailId" name="confirmEmailId"></td>
	    <td><form:errors path="confirmEmailId" cssClass="error"></form:errors></td>
	</tr>
    
	<tr>
	    <td><input type="checkbox" id="status" name="status"></td>
	    <td><b>I agree</b></td>
	    <td><form:errors path="status" cssClass="error"></form:errors></td>
	</tr>
    
	<tr>
	    <td><input type="submit" id="Register" name="submit"></td>
	    <td><input type="reset" id="Cancel" name="cancel"></td>
	</tr>







</table>
</form:form>


</body>
</html>