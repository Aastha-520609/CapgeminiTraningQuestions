<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<body bgcolor="lavender">
<h1><center>Candidate List</center></h1>
<!--  Fill the code -->
<table border="1" style="margin: 0px auto; margin-left: auto; margin-right:auto">
    <tr>
        <th>Name</th>
        <th>Contact</th>
        <th>Gender</th>
        <th>Position</th>
        <th>Salary</th>
        <th>Experience</th>
    </tr>
    <c:forEach items="${candidates}" var="candidate">
        <tr>
            <td>${candidate.candidateName}</td>
            <td>${candidate.contactNumber}</td>
            <td>${candidate.gender}</td>
            <td>${candidate.positionApplied}</td>
            <td>${candidate.expectedSalary}</td>
            <td>${candidate.yearsOfExperience}</td>
        </tr>
    </c:forEach>
</table>


<center>	<a href="home">Back to Home</a>	</center>
</body>
</html>	 	  	  		    	   	 	   	 	
