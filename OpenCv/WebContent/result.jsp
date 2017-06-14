<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<script>
function f(){
	location.reload() 
}
</script>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<meta http-equiv="pragma" content="no-cache" /> 
<base target="_self"> 
<title>文件上传</title> 
</head>
<body>
<s:form method="post" action="UpLoad" enctype="multipart/form-data">
<input type="file" name="image" value="file">
<input type="submit" onclick="" value="确定">
<img alt="" src="Main.action" id="resultImage">
</s:form>
识别后的结果为:<%=request.getAttribute("resultNum")%>
<!--img alt="" src=<%=request.getAttribute("resultNum")%> id="resultImage"-->
</body>
</html>