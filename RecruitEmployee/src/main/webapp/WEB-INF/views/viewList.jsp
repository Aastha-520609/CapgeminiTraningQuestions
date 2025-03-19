<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<body bgcolor="lavender">
	<h1>
		<center>Candidate List</center>
	</h1>
	<table>
		<tr>
			<th>Candidate Name</th>
			<th>Contact Number</th>
			<th>Gender</th>
			<th>Position Applied</th>
			<th>Expected Salary</th>
			<th>Experience in years</th>
		</tr>
		<c:forEach var="candidate" items="${candidates}">
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

	<center>
		<a href="home">Back to Home</a>
	</center>
</body>
</html>
