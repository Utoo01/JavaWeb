 
	function openModulUrl(modulUrl) {
		parent.mainFrame.location = modulUrl;
	}
	function replaceModulUrl(modulUrl) {
		document.location = modulUrl;
	}
	
	function deleteRecords(url) {
		//去第一个form表单
		var actionForm = document.forms[0];
		var cbs = actionForm.elements;
		var i ;
		for (i = 0; i < cbs.length; i++) {
			if (cbs[i].type =="checkbox"&&cbs[i].checked) {
				if (!window.confirm("u\786e\u5b9a\u8981\5520\u9664\u9009\u4e2d\u7684\u8bb0\u5f55\u5417\uff1f")) {
					return;
				}else{
	break;
}
			}
		}
		if (i == cbs.length) {
			alert("\u8bf7\u9009\u4e2d\u8981\u5220\u9664\u7684\u8bb0\u5f55")
			return ;
		}
		actionForm.action = url;
		actionForm.submit();
	}
	//重置第一个form表单
	function resetForm() {
		//取得第一个form表单
		var actionForm = document.forms[0];
		var cbs = actionForm.elements;
		var i ;
		for (i = 0;  i< cbs.length; i++) {
			if (cbs[i].Type == "checkbox"&&cbs[i].checked) {
				cbs[i].checked = false;
			}else {
				if (cbs[i].type == "text") {
					cbs[i].value ="";
				} else {
					//alert(cbs[i].type)
				}
			}
		}
	}
	
	//显示信息flg = 0；错误信息 flg = 1 ；正确信息 flg = 2 ；提示信息
	function show_message(objName,flg,message) {
		var preText ="";
		var obj = document.getElementById(objName);
		if (flg == 0) {
			obj.className = "box_div_wrong";
			preText = "<img src='image/wrong.gif' style ='margin-right:5px;'/>";
		}else {
			if (flg == 1) {
				obj.className = "boxO_div_right";
				preText = "<img src='image/right.gif' style ='margin-right:5px;'/>";
			} else {
				   obj.className = "box_div_right"
			}
		}
		obj.innerHTML = preText +message;
	}
	//去除边空格
	function trimString(str) {
		var i,j;
		if (str =="") {
			return "";
		}
		for (var i = 0; i < str.length; i++) {
			if (str.charAt(i)!="") {
				break;
			}
		}
		if (i>=str.length) {
			return "";
		}
		if (i>=str.length) {
			return "";
		}
		for (var j = str.length-1; j >=0; j--) {
			if (str.charAt(j)!="") {
				break;
			}
		}
		return str.substring(i,j+1)
	}
function out_chkEmpty(chkObjName,msg_labelName,errMessage){
	var chk=false;
	var obj=document.getElementById(chkObjName);
	if(trimString(obj.value)!=""){
		show_message(msg_labelName,"1","\u8f93\u5165\u6b63\u786e!");
		chk=true;
	}else{
		show_message(msg_labelName,"0",errMessage);
	}
	return chk;
	}

function out_chkMaxLength(chkObjName,msg_labelName,errMessage,length){
	var chk=false;
	var obj=document.getElementById(chkObjName);
	if((trimString(obj.value).length>0)&&(trimString(obj.value).length<length)){
		show_message(msg_labelName,"1","\u8f93\u5165\u6b63\u786e!");
		chk=true;
	}else{
		show_message(msg_labelName,"0",errMessage);
	}
	return chk;
	}


function out_chkEmail(chkObjName,msg_labelName,errMessage,length){
	var exp=/^[\w\.\-]+@([\w\-]+\.)+[a-z]{2,4}$/ig;
	var chk=false;
	var obj=document.getElementById(chkObjName);
	if(!out_chkMaxLength(chkObjName,msg_labelName,errMessage,length)){
		return chk;
	}
	if(trimString(obj.value).match(exp)){
		show_message(msg_labelName,"1","\u8f93\u5165\u6b63\u786e!");
		chk=true;
	}else{
	show_message(msg_labelName,"0",errMessage);
	}
	return chk;
	}

function out_chkPhone(chkObjName,msg_labelName,errMessage){
	var exp=/^\d{11,12}$/ig;
	var chk=false;
	var obj=document.getElementById(chkObjName);
	if((trimString(obj.value).length>0)&&(trimString(obj.value).match(exp))){
		show_message(msg_labelName,"1","\u8f93\u5165\u6b63\u786e!");
		chk=true;
	}else{
	show_message(msg_labelName,"0",errMessage);
	}
	return chk;
	}

function out_pickerDate(chkObjName,msg_labelName,errMessage){
	var chk=false;
	var obj=dojo.widget.byId(chkObjName);
	if(trimString(obj.getValue())!=""){
		show_message(msg_labelName,"1","\u8f93\u5165\u6b63\u786e!");
		chk=true;
	}else{
	show_message(msg_labelName,"0",errMessage);
	}
	return chk;
	}
 
