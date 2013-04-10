<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<title>Sample</title>
</head>
<body>
	<a href="http://jquery.com/">jQuery</a>
	<script type="text/javascript">
		$(document).ready(function() {
			$("a").click(function(event) {
				alert("Thanks for visiting!");
				event.preventDefault();
			});
		});
	</script>
</body>
</html>