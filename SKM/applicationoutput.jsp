<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Application Output</title>
</head>
<body>
<h2>Your Application Status: <%=request.getAttribute("message") %> </h2><br>
<h3>Your ApplicationId is : <%=request.getAttribute("applicationid")%></h3>

</body>
</html>