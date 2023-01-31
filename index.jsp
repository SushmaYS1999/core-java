<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
<h1>send the details...</h1>
<form action="sms" method="post">
FirstName<input type="text" name="fname" />
SecondName<input type="text" name="sname" />
Gender male<input type="radio" name="gender" value="male" />
	female<input type="radio" name="gender" value="female" />
Reason<textarea row="5" cols="25" name="reason" ></textarea>
Address<textarea row="5" cols="25" name="address" ></textarea>
<input type="submit" value="send" />
</form>
</pre>
</body>
</html>