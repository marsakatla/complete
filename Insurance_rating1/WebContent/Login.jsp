<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

</head>
<body>
<form action="LoginServlet" method="post">
<div id="top" style=height:100px></div>
<div id="middle" style="height:200px;border:solid;">
<center><h1>Login</h1>
Username <input type="text" name="uid"><br><br>
Password <input type="password" name="pwd"><br><br>
<input type="submit" value="Submit" style="border:solid;font-weight: bold;">&emsp;
<input type="Button" value="Clear" style="border:solid;font-weight: bold;">&emsp;
<input type="Button" value="Cancel" style="border:solid;font-weight: bold;"> </center></div>
<div id="bottom"></div>
</form>
</body>
</html>