<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

<form action="login" method="post">
<pre>
Username:<input type="text" name="username"/>
Password:<input type="password" name="password"/>
<input type="submit" value="login"/>
${msg}
</pre>
</form>
</body>
</html>