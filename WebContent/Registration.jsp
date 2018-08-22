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
	if(theForm.email.value=="")
		{
			alert("Please Enter Email");
			theForm.email.focus();
			return false;
		}
	if(theForm.fileToUpload.value=="")
	{
		alert("Please Upload Your Picture");
		theForm.fileToUpload.focus();
		return false;
	}
	if(theForm.password.value=="")
	{
		alert("Please Enter Password");
		theForm.password.focus();
		return false;
	}
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

<h4><font face="Gabriola">  Just  fill  in  the  details  and  Register  Yourself  Here..!!</font></h4>

<form action="registration.do" method="post" onsubmit="return validateForm(this);">
<pre>
<font face="Comic Sans MS" color="blue">Name                     : <input type="text" name="name" ></font>              
<br> 
<font face="Comic Sans MS" color="blue">Age                        : <input type="number" name="age"></font>                 
<br> 
<font face="Comic Sans MS" color="blue">Email                      : <input type="email" name="email"></font>                
<br>
<font face="Comic Sans MS" color="blue">Password                : <input type="password" name="password"></font>            
<br>
<font face="Comic Sans MS" color="blue">Confirm Password  : <input type="password" name="confirmPassword"></font>      
<br>
<font face="Comic Sans MS" color="blue">Country</font>          : <select name="country">
			<option value="ind">India</option>
			<option value="aus">Australia</option>
			<option value="sa">South Africa</option>
			<option value="eng">England</option>
			<option value="nz">New Zealand</option>
			<option value="pak">Pakistan</option>
			<option value="arg">Argentina</option>
			<option value="rom">Romania</option>
			<option value="spa">Spain</option>
		  </select>
<br>
<font face="Comic Sans MS" color="blue">Contact Number    : <input type="number" name="contactNumber"></font>      
<br>
<font face="Comic Sans MS" color="green">Upload Your Photo</font>

<input type="file" name="fileToUpload" id="fileToUpload">

<input type="submit" value="Register" name="submit">
</pre>
</form>

</body>
</html>