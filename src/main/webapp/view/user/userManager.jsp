<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic DataGrid - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/demo/demo.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
</head>
<body>
    <h2>Basic DataGrid</h2>
    <div style="margin:20px 0;"></div>
    
    <table id="users" class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
            data-options="singleSelect:true,collapsible:true,url:'${pageContext.request.contextPath}/userController/listUsers',method:'post'">
        <thead>
            <tr>
                <th data-options="field:'name',width:80">name</th>
                <th data-options="field:'code',width:100">code</th>
                <th data-options="field:'age',width:80,align:'right'">age</th>
                <th data-options="field:'email',width:250">email</th>
            </tr>
        </thead>
    </table>
</body>
<script type="text/javascript">
	function searchUser() {
	    $("#users").datagrid('load', {});
	}
</script>
</html>