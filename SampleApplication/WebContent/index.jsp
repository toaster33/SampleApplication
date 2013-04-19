<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<title>Sample</title>
</head>
<body>
	<script type="text/javascript">
		$(document).ready(function() {
			$("a").click(function(event) {
				alert("Redirecting!");
			});
		});
	</script>

	<h1>Sample</h1>
	<p>This is my sample default page.</p>

	<a href="login.jsp">Login</a>
</body>
</html>