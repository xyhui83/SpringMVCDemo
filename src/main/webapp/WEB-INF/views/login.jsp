<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body>
	<div>
		<form action="${pageContext.request.contextPath }/user/login" id="loginform" method="POST">
			<table align="center" style="padding: 100px">
				<tr>
					<td>姓名：<input type="text" name="name" id="name" value="${user.name}"/> *必需
					</td>
					<td><form:errors path="userForm.name" /></td>
				</tr>
				<tr>
					<td>密码：<input type="password" name="password" id="password" value="${user.password}">
						*必需
					</td>
					<td><form:errors path="userForm.password"/></td>
				</tr>
				<tr>
					<td>密码：<input type="text" name="email" id="email" value="${user.email}">
						*必需
					</td>
					<td><form:errors path="userForm.email"/></td>
				</tr>
				<tr>
					<td><input type="submit"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>