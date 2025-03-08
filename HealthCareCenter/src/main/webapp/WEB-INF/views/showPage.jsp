<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>V Care 4 U - Book Appointment</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f9f9f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: #fff;
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            width: 100%;
        }
        h1 {
            text-align: center;
            color: #4CAF50;
        }
        label {
            font-weight: bold;
            display: block;
            margin-top: 10px;
        }
        select, input {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 8px;
        }
        button {
            width: 100%;
            padding: 12px;
            margin-top: 20px;
            background: #4CAF50;
            color: white;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-size: 16px;
        }
        button:hover {
            background: #45a049;
        }
        #message {
            margin-top: 20px;
            text-align: center;
            color: #333;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Book Your Appointment</h1>

        <form action="/consultation" method="post">
            <label for="consultationFor">Choose Consultation:</label>
            <select id="consultationFor" name="consultationFor">
                <c:forEach items="${consultationList}" var="consultation">
                    <option value="${consultation}">${consultation}</option>
                </c:forEach>
            </select>

            <label for="patientName">Patient Name:</label>
            <input type="text" id="patientName" name="patientName" required>

            <label for="age">Age:</label>
            <input type="number" id="age" name="age" required>

            <label for="phoneNumber">Phone Number:</label>
            <input type="text" id="phoneNumber" name="phoneNumber" required>

            <button type="submit" name="submit">Book Appointment</button>
        </form>

        <div id="message">${message}</div>
    </div>
</body>
</html>
