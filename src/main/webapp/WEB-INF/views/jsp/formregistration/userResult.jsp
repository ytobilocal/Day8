<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2> Registration  Result </h2>
	<table>
	    <tr>
	        <td>Name</td>
	        <td>${user.name}</td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>${user.lastname}</td>
        </tr>
        <tr>
            <td>PassWord</td>
            <td>${user.password}</td>
        </tr>
        <tr>
            <td>Detail</td>
            <td>${user.detail}</td>
        </tr>
        <tr>
            <td>Birth Date</td>
            <td>${user.birthDate}</td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>${user.gender}</td>
        </tr>
        <tr>
            <td>Country</td>
            <td>${user.country}</td>
        </tr>
        <tr>
            <td>Non-Smoking</td>
            <td>${user.nonSmoking}</td>
        </tr>
    </table>
</body>
</html>