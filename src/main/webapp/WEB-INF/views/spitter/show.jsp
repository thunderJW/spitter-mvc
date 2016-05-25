<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<body>
		<div>
		<h2>Create a free Spitter account</h2>
		
		<sf:form method="POST" modelAttribute="spitter">
			<fieldset>
			<table cellspacing="0">
				<tr>
					<th><label for="user_full_name">Full name:</label></th>
					<td><sf:input path="fullName" size="15" id="user_full_name" /></td>
				</tr>
				<tr>
					<th><label for="user_screen_name" >Username:</label></th>
					<td><sf:input path="nusername" size="15" maxlength="15" id="user_screen_name" />
						<small id="username_msg">NO spaces, please.</small>
					</td>
				</tr>
				<tr>
					<th><label for="user_password" >Password:</label></th>
					<td>
						<sf:password path="password" size="30" showPassword="true" id="user_password" />
						<small>6 characters or more (be tricky!)</small>
					</td>
				</tr>
			</table>
			</fieldset>
		</sf:form>	
		</div>
	</body>
</html>
