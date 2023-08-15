<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Page</title>
<style>
.Container h3 {
	text-align: center;
}

.Container {
	width: 40%;
	border: 1px solid black;
	margin: auto;
	padding: 20px;
	font-size: 20px;
	    background-color: aliceblue;
	
}
</style>
</head>
<body>
	<div class="Container">
		<h3>Registeration</h3>
		<form action="RegisterServlet" method="post">
		 
			<table>
				<tr>
					 <td>user name</td>
					<td>
					<input type="text" name="name"
						placeholder="Enter here" required /></td>
				</tr>

				<tr>
					 
					 <td>Email</td>
					<td><input type="Email" name="email"
						placeholder="Ente here" required></td>
				</tr>
					<tr>
					 
					 <td>Password</td>
					<td><input type="password" name="contact"
						placeholder="Ente here" required></td>
				</tr>
				<tr>
					 
					 <td>Password</td>
					<td><input type="password" name="username"
						placeholder="Ente here" required></td>
				</tr>
					 <tr>
					 
					 <td>Re-Enter Password</td>
					<td><input type="password" name="password" placeholder="Ente here" required></td>
					</tr>
				<tr>
					<td style="text-align: right;"><input type="checkbox"
						value="checked" name="condition"></td>
					<td>Agree terms and conditions</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<button type="submit">Register</button>

						<button type="submit">Reset</button>
					</td>
				</tr>
			</table>
			 
		</form>
	</div>
</body>
</html>