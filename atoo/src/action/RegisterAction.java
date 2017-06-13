package action;

import service.RegisterService;



import entity.User;

public class RegisterAction  {
	private RegisterService registerService  = new RegisterService();
	//1 
	private User user;
	
	


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String regist(){
	
		//准备数据
		System.out.println("1");
		
		boolean result =registerService.register(user);
		if (result==true){
			return "success";
		}else{
			return "false";	
		}
		//return "";
	}
	
	
}
