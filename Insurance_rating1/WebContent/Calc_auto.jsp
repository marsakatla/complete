<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="PremiumCalc" method="post">
<center>
<div id="top" style=height:100px></div>
<div id="middle" style="height:200px;border:solid;">
<h1>Calculate Auto insurance premium</h1>
<br>
Select Vehicle model
<%

session=request.getSession(false);  
ArrayList<String> models=(ArrayList<String>)session.getAttribute("models"); 
out.print("<select name='category'>");
for(String a:models)
{
	out.print("<option>"+a+"</option>");
}
out.print("</select>");
%>
<br>
<br>
<br>
<input type="submit" value="Calculate Auto Premium" style="border:solid;font-weight: bold;">&emsp;
<input type="Button" value="Back" style="border:solid;font-weight: bold;">
</div>

<div id="bottom"></div>
</form>
</body>
</html>