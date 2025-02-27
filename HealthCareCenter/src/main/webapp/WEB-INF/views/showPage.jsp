<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <style>
        #message {
            color: red;
        }
    </style>
</head>

<body style="background-color:lavender">

<a href="/showPage?language=en">English</a> | <a href="/showPage?language=fr">French</a>

<h1><center>Health Care Center</center></h1>

<form:form method="POST" action="/consultation" modelAttribute="patient">
    <table style="margin: 0px auto;">

        <!-- Patient Name -->
        <tr>
            <td><spring:message code="label.patientName" /></td>
            <td><form:input path="patientName" id="patientName" required="true" /></td>
        </tr>

        <!-- Age -->
        <tr>
            <td><spring:message code="label.age" /></td>
            <td><form:input path="age" id="age" type="number" required="true" /></td>
        </tr>

        <!-- Phone Number -->
        <tr>
            <td><spring:message code="label.phoneNumber" /></td>
            <td><form:input path="phoneNumber" id="phoneNumber" required="true" /></td>
        </tr>

        <!-- Consultation For -->
        <tr>
            <td><spring:message code="label.consultationFor" /></td>
            <td>
                <form:select path="consultationFor" id="consultationFor">
                    <form:option value="Optometry">Optometry</form:option>
                    <form:option value="Pediatrist">Pediatrist</form:option>
                    <form:option value="Physical therapy">Physical therapy</form:option>
                    <form:option value="Dentistry">Dentistry</form:option>
                    <form:option value="Psychology">Psychology</form:option>
                </form:select>
            </td>
        </tr>

        <!-- Submit -->
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit" />
            </td>
        </tr>

    </table>
</form:form>

<div id="message">${message}</div>

</body>
</html>
