package helloWorld;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class HelloWorldAction {
	String username;//注意 ：和前台jsp页面 名字一致  并且有对应的get set方法
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String execute (){
		
		Map session = ActionContext.getContext().getSession();
		session.put("a",username);
		//将前台的helloworld.jsp中的 参数username （tom）存入到 session的属性a中
		//？ username如何拿到的？因为有与前台页面同名的username参数 和setUsername方法，可以 自动获取到前台的 username参数
		return  "success";
	}

}
