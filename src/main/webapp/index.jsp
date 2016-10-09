<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的首页</title>
</head>
<body>
这是J2EE<br/>
${pageContext.request.contextPath}<br/>
<%=request.getContextPath()%>
<hr />
<div id="news"></div>
<input type="button" onclick="magic();" value="数字方块" />
</body>
<script type="text/javascript">
	function magic() {
		for (var i = 0; i < 1000; i++) {
			document.getElementById("news").innerHTML = i;
		}
	}
</script>
</html>