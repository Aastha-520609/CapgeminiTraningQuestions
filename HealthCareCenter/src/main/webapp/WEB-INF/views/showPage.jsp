<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<style>
#message{
color:red;
}
</style></head>
<body style="background-color:lavender">

<!--  Do not change the below line -->
<a href="/showPage?language=en">English</a>|<a href="/showPage?language=fr">French</a></align>
<!--  Design the page as per the requirements-->
<h1><center>Health Care Center</center></h1>

<center>
<form:form action = "consultation" modelAttribute="appointment" method = "post">
<table style="margin: 0px auto; margin-left: auto; margin-right:auto">
<tr><td><spring:message code = "label.patientName"></spring:message></td><td><form:input path = "patientName" name = "patientName" /></td></tr>
<tr><td><spring:message code = "label.phoneNumber"></spring:message></td><td><form:input path = "phoneNumber" name = "phoneNumber"/></td></tr>
<tr><td><spring:message code = "label.age"></spring:message></td><td><form:input path= "age" name ="age" id = "age" /></td></tr>
<tr><td><spring:message code = "label.consultationFor"></spring:message></td><td><form:select path="consultationFor" name = "consultationFor">
<form:options items = "${consultationList}" />
</form:select></td></tr>
<tr><td><input type = "submit" name = "submit" id = "submit" value = "Book Appointment" />
</td></tr>
		   	
		   	
<tr> <td colspan=2><div id="message">${message}</div></td></tr>
</table>
</form:form>

</center>
</body>
</html>	 	  	    	    	     	      	 	
