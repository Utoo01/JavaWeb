package service;

import dao.RegisterDao;
import entity.User;

public class RegisterService {
	//��װһЩҵ���߼�

	private RegisterDao   registerDao= new RegisterDao();


	



	public boolean register (User user){
	//����ֻ��Ů�Բ���ע���Ա ��ô���Ǹ���򵥵�ҵ���߼�
		//if (user.getSex().equals("fe")){
		return registerDao.save(user);
		//}
	}
	
}
