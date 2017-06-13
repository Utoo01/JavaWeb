package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.User;

public class RegisterDao {
	
	//�����ݿ�򽻵� �����쳣ȥ���� �������ݿ���

	Configuration cfg = null;
	SessionFactory  sessionFactory  = null;
	Session session = null;
	Transaction  tx= null;
	
	public RegisterDao(){
		cfg = new Configuration();
		cfg.configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public boolean save (User user){
		
		System.out.println("1");
		boolean ret = false;
		
		try {
			session = sessionFactory.openSession();
			tx= session.beginTransaction();
			session.save(user);
			
			tx.commit();
			ret = true;
			System.out.println("2");
		}catch (HibernateException e){
			if (tx!=null){
				tx.rollback();
			}
			e.printStackTrace();
			ret =false;
		}
		if (session!=null){
			session.close();
		}
		System.out.println("3");
		return ret;
		
		
	}
	
	
}
