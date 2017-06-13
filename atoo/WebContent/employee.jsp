<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
	<s:form action="employeeAction" method="post" theme="simple">
		<table border="0" cellpadding="1" cellspacing="1" width="95%">
			<tr>
				<td align="right" width="10%" nowrap="true">员工编号</td>
				<td width="20%"><s:textfield name="employee.code" cssClass="TextInput">
				</s:textfield></td>
				<td align="right" width="10%" nowrap="true">员工名称</td>
				<td width="20%"><s:textfield name="employee.name" cssClass="TextInput">
				</s:textfield></td>
				<td width="40%">&nbsp;</td>
			</tr>
			<tr>
				<td align="right" width="10%" nowrap="true">&nbsp;</td>
				<td width="20%">&nbsp;</td>
				<td width="70%" colspan="5">&nbsp;</td>
			</tr>
		</table>
		<p></p>
		<div style="margin-left: 30px; margin-right: 0px">
		<table border="0" cellpadding="1" cellspacing="1" width="95%">
			<tr>
				<td width="10%">
				<s:submit value="查找" cssClass="BtnAction" method="findEmployee">
				</s:submit>
				
				</td>
			 	<td width="10%">
			 	<input type="button" class="BtnAction" value="新增" onClick="replaceModulUrl('addEmployee.jsp');">
				</td> 
				<td width="10%"><input type="button"  onClick="deleteRecords('employeeAction!deleteEmployee.action')" value="删除" class="BtnAction"/>
				
				</td>
				<td width="10%"><input type="reset" value="重置" class="BtnAction"></td>
				<td width="60%">&nbsp;</td>
			</tr>
			
		</table>
		</div>
		<p></p>
		<div style="margin-left:30px; margin-right:0px">
			<table width="90%" border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td width="5%"  class="td_title">选择</td>
					<td width="5%"  class="td_title">修改</td>
					<td width="10%" class="td_title">员工编号</td>
					<td width="15%" class="td_title">员工名称</td>
					<td width="15%" class="td_title">出生年月日</td>
					<td width="8%"  class="td_title">员工性别</td>
					<td width="19%" class="td_title">员工电话</td>
					<td width="15%" class="td_title">员工Email</td>
				</tr>
				<s:iterator var="employee" value="employees">
				<!-- 从employess列表中取出每个对象，依次放入employee对象，进行下面操作
				 -->
				<tr>
					<td align="center" class="td_border">
					<input name="employeeId" type="checkbox"  title="选中后可进行删除操作" value='<s:property value="#employee.id"/>'>
					</td>
					<td align="center" class="td_border">
					<a href='employeeAction!preUpdateEmployee.action?employee.id=
					<s:property value="#employee.id"/>'>修改</a>
					</td>
					<td class="td_border"><s:property value="#employee.code"/></td>
					<td class="td_border"><s:property value="#employee.name"/></td>
					<td class="td_border"><s:property value="#employee.birthday"/></td>
					<td class="td_border">
					<s:if test="#employee.sex==true">男</s:if>
					<s:if test="#employee.sex==false">女</s:if>
					</td>
					<td class="td_border"><s:property value="#employee.telephone"/></td>
					<td class="td_border"><s:property value="#employee.email"/></td>
				</tr>
				</s:iterator>
			</table>
		</div>
	</s:form>
</body>
</html>
