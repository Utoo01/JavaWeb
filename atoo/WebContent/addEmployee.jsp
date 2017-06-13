<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="s"  uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增员工档案</title>
<sx:head extraLocales="en-us,nl-nl,de-de" />
</head>
<body>
 	<s:form action="employeeAction" method="post" >
	<table border="0"  cellpadding="1" cellspacing="1"  width="95%">
		<tr><td  cospan="6">	档案管理->员工档案->新增</td></tr>
		<tr>
			<td>员工编号</td>				
			<td>			
				<s:textfield  name="employee.code"  id="code"  
				onFocus="show_message('msg_code','2','请输入编号');"
				onBlur="out_code()"	value="123"		
				></s:textfield>			
			</td>
			<td>员工姓名</td>
			<td>
				 <s:textfield  name="employee.name"  id="name"  
				onFocus="show_message('msg_name','2','请输入名称');"						
				value="123"	></s:textfield>
			</td>
			<td>出生年月日</td>
			<td>
				<sx:datetimepicker label="" name="employee.birthday"
				 displayFormat="yyyy-MM-dd" language="en-us" type="date"
				 id="p_date" required="true" value="" >
				 </sx:datetimepicker>
			</td>
		</tr>
		<tr>
			<td>员工性别</td>				
			<td>			
				<s:textfield  name="employee.sex"  id="sex"
				value="m"	></s:textfield>			
			</td>
		
			<td>员工电话</td>				
			<td>			
				<s:textfield  name="employee.telephone"  id="phone"  
				value="123"	></s:textfield>			
			</td>
		
			<td>员工email</td>			
			<td>			
				<s:textfield  name="employee.email"  id="email"  
			value="123"	></s:textfield>			
			</td>
		</tr>
	</table>	
	<table>	
		<tr>
			<td>
				<s:submit value="保存"  method="saveEmployee"></s:submit>
			</td>				
			<td>			
				<input type="button" value="返回" onClick="history.go(-1)">			
			</td>
		</tr>
	</table>
</s:form>
</body>
</html>