<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Success</title>


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
	if(theForm.password.value=="")
	{
		alert("Please Enter Password");
		theForm.password.focus();
		return false;
	}
	return true;
}
</script>

</head>
<body bgcolor="#EEEEEE">

<h1><font face="Comic Sans MS" size="4" color="red">${email}</font></h1>
<br>
<h5><font face="Palatino Linotype">*Enter your email and password</font></h5>
<h5><font face="Palatino Linotype">*Login to access your account</font></h5>
<br>

<form action="login.do" method="post" onsubmit="return validateForm(this);">
<pre>
<font face="Comic Sans MS" color="blue">Email       : <input type="text" name="email"></font>
<br>
<font face="Comic Sans MS" color="blue">Password : <input type="password" name="password"></font>
<br>
<input type="submit" name="submit" value="Login">
</pre>

<h4><a href="ResetPassword.jsp">Reset Password</a></h4>

<font face="Palatino Linotype" color="red" size="3">${login_error}</font>
</form>

</body>
</html>