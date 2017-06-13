<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="s"  uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改员工档案</title>
<sx:head extraLocales="en-us" />
</head>
<body>
	<s:form action="employeeAction" method="post" theme="simple">		
		
<s:hidden name="employee.id"> </s:hidden>
<s:hidden name="employee.code"> </s:hidden>
	
		<p></p>
		<div style="margin-left:30px; margin-right:0px">
			<table width="90%" border="1" cellpadding="0" cellspacing="0">
				<tr>					
					<td width="10%" class="td_title">员工编号</td>
					<td width="15%" class="td_title">员工名称</td>
					<td width="15%" class="td_title">出生年月日</td>
				</tr>					
				<tr>
				
					<td class="td_border">
					<s:textfield  name="employee.code" disabled="true"		
				    ></s:textfield>
					</td>
					<td class="td_border">
					
					<s:textfield  name="employee.name"  id="name"  
				onFocus="show_message('msg_name','2','请输入名称');"						
				></s:textfield>
				
				</td>
					<td class="td_border">
					
					<sx:datetimepicker label="" 
					                   name="employee.birthday" 
					                   id="p_date" 
					                   displayFormat="yyyy-MM-dd"
					> </sx:datetimepicker>
					
					</td>
					
					</tr>
					
				<tr>
					<td width="8%"  class="td_title">员工性别</td>
					<td width="19%" class="td_title">员工电话</td>
					<td width="15%" class="td_title">员工Email</td>
				</tr>
				<tr>
					<td class="td_border">				
					<s:textfield  name="employee.sex"  id="sex"	></s:textfield>	
					</td>
					<td class="td_border">
					<s:textfield  name="employee.telephone" id="phone" 	></s:textfield>
					</td>
					<td class="td_border">
					<s:textfield  name="employee.email"  id="email"		></s:textfield>
					</td>
				</tr>
				
			</table>
			
		<table border="0" cellpadding="1" cellspacing="1" width="95%">
			<tr>
				<td width="10%">
					<s:submit value="保存" cssClass="BtnAction" 
					method="updateEmployee">	</s:submit>
				</td>
			 	<td width="10%">
				 	<s:submit value="返回" cssClass="BtnAction" 
					onClick="history.go(-1)">	</s:submit>
				 	
			 	</td> 
				<td width="10%"></td>
				<td width="10%"></td>
				<td width="60%">&nbsp;</td>
			</tr>
			
		</table>
		</div>
	</s:form>
</body>
</html>
