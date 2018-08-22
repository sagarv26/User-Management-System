<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Page</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>



<script type="text/javascript">

function validateForm(theForm)
{
	if(theForm.confirmPassword.value=="")
	{
		alert("Please Confirm Your Password");
		theForm.confirmPassword.focus();
		return false;
	}
	if(theForm.password.value!==theForm.confirmPassword.value)
	{
		alert("Passwords are not matching");
		theForm.password.focus();
		theForm.confirmPassword.focus();
		return false;
	}
	return true;
}
</script>
</head>

<body bgcolor="#EEEEEE">

<h4><font face="Gabriola">Update  your  details  here..!!</font></h4>

<form action="update.do" method="post" onsubmit="return validateForm(this);">
<pre>
<font face="Comic Sans MS" color="blue">Name                     : <input type="text" name="name" value="${DTOfrmDB.name}"></font>              
<br>
<font face="Comic Sans MS" color="blue">Age                        : <input type="text" name="age" value="${DTOfrmDB.age}"></font>                 
<br> 
<font face="Comic Sans MS" color="blue">Email                      : <input type="text" name="email" value="${DTOfrmDB.email}" readonly="readonly"></font>                
<br>
<font face="Comic Sans MS" color="blue">Password                : <input type="password" name="password" value="${DTOfrmDB.password}"></font>            
<br>
<font face="Comic Sans MS" color="blue">Confirm Password  : <input type="password" name="confirmPassword" value="${DTOfrmDB.confirmPassword}"></font>      
<br>
<font face="Comic Sans MS" color="blue">Country</font>          : <select name="country">
			<option>${DTOfrmDB.country}</option>
			<option >India</option>
			<option >Australia</option>
			<option >South Africa</option>
			<option >England</option>
			<option >New Zealand</option>
			<option >Pakistan</option>
			<option >Argentina</option>
			<option >Romania</option>
			<option >Spain</option>
		  </select>
<br>
<font face="Comic Sans MS" color="blue">Contact Number    : <input type="text" name="contactNumber" value="${DTOfrmDB.contactNumber}"></font>      
<br>
<input type="submit" value="Update" name="submit">
</pre>
</form>

</body>
</html>