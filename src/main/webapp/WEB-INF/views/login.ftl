<#import "common/spring.ftl" as spring />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body>
	<div>
		<form action="${request.contextPath}/user/login" id="loginform" method="POST">
			<table align="center" style="padding: 100px">
				<tr>
					<td>姓名：<input type="text" name="name" id="name" value="<#if user??>${user.name!''}</#if>"/> *必需
					</td>
					<td>
						<#if userForm ??>
							<@spring.bind "userForm.name"/>
							<@spring.showErrors ""/>
						</#if>
					</td>
				</tr>
				<tr>
					<td>密码：<input type="password" name="password" id="password" value="<#if user??>${user.password!''}</#if>">
						*必需
					</td>
					<td>
						<#if userForm ??>
							<@spring.bind "userForm.password"/>
							<@spring.showErrors ""/>
						</#if>
					</td>
				</tr>
				<tr>
					<td>密码：<input type="text" name="email" id="email" value="<#if user??>${user.email!''}</#if>">
						*必需
					</td>
					<td>
						<#if userForm ??>
							<@spring.bind "userForm.email"/>
							<@spring.showErrors ""/>
						</#if>
					</td>
				</tr>
				<tr>
					<td><input type="submit"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>