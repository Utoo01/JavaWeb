package helloWorld;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class HelloWorldAction {
	String username;//ע�� ����ǰ̨jspҳ�� ����һ��  �����ж�Ӧ��get set����
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String execute (){
		
		Map session = ActionContext.getContext().getSession();
		session.put("a",username);
		//��ǰ̨��helloworld.jsp�е� ����username ��tom�����뵽 session������a��
		//�� username����õ��ģ���Ϊ����ǰ̨ҳ��ͬ����username���� ��setUsername���������� �Զ���ȡ��ǰ̨�� username����
		return  "success";
	}

}
