package service;

import dao.RegisterDao;
import entity.User;

public class RegisterService {
	//包装一些业务逻辑

	private RegisterDao   registerDao= new RegisterDao();


	



	public boolean register (User user){
	//假设只有女性才能注册会员 那么这是个最简单的业务逻辑
		//if (user.getSex().equals("fe")){
		return registerDao.save(user);
		//}
	}
	
}
