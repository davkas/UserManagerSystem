<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user login</title>
</head>
<body>
	<center>
		<div>
			<%@ include file="top.html" %>
		</div>
		<s:form action="login" method="post">
			<s:textfield label="账户" name="user.username" ></s:textfield>
			<s:password label="密码" name="user.password"></s:password>
			<s:submit value="登录"></s:submit>
			<s:token></s:token>
			<s:actionerror/>
		</s:form>
	</center>

</body>
</html>