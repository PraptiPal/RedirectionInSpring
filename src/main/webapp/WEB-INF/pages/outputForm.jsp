<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output Page</title>
</head>
<body>
${param.fname }
${param.lname }

<form action = "redirect" method = "GET">

  <input type = "submit" value = "click here to go back to input page">
</form>
<br>
<br>

</body>
</html>