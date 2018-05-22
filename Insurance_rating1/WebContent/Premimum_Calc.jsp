<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FinalPrice" method="post">


<div id="middle" style="border:solid;">
<h1>Calculate Auto insurance premium</h1>
<br>

<%

session=request.getSession(false);  
String[] a =(String[])session.getAttribute("premium"); 
out.print("Vehicle Model    "+a[0]+"<br>");
out.print("Base Premium     "+a[1]);
%>
<table name="values" border=1px width="100%">
<center>
<tr>
<td>Vehicle Type</td>
<td>
<select name="vehicle" style="width:100%">
<option>Petrol</option>
<option>Diesel</option>
<option>CNG</option>
</select>
</td>
</tr>
<tr>
<td>Proof for Earlier Insurance</td>
<td><select name="Earlier Insurance" style="width:100%">
<option>Yes</option>
<option>No</option>

</select></td>
</tr>
<tr>
<td>Driver Class</td>
<td><select name="Driver Class" style="width:100%">
<option>Transport</option>
<option>Non Transport</option>

</select></td>
</tr>
<tr>
<td>Advanced Security Features</td>
<td><select name="Adv Security" style="width:100%">
<option>Yes</option>
<option>No</option>

</select></td>
</tr>
<tr>
<td>Anti Theft Alarm</td>
<td><select name="Anti Theft" style="width:100%">
<option>Yes</option>
<option>No</option>

</select></td>
</tr>
<tr>
<td>Violation History</td>
<td><select name="Violation" style="width:100%">
<option>Yes</option>
<option>No</option>

</select></td>
</tr>

<tr>
<td>Policy Term</td>
<td><select name="Policy Term" style="width:100%">
<option>Long</option>
<option>Short</option>

</select></td>
</tr>
</center>
</table>
<br>
<br>
<br>
<input type="submit" value="Calculate" style="border:solid;font-weight: bold;">&emsp;
<input type="Button" value="Back" style="border:solid;font-weight: bold;">
<input type="reset" value="Clear" style="border:solid;font-weight: bold;">
</div>

<div id="bottom"></div>
</form>
</body>
</html>