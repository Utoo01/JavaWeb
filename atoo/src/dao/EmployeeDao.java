package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entity.Employee;

public class EmployeeDao extends HibernateDaoSupport
implements IEmployeeDao


{
	@Override
	public List<Employee> findEmployee(Employee employee) {
		List<Employee> list1= null;
		try {
		DetachedCriteria criteria =DetachedCriteria.forClass(Employee.class);
		if (null!=employee){
			if (null!=employee.getId() &&
					String.valueOf(employee.getId()).trim().length()>0){
				
				criteria.add(Restrictions.eq("id",employee.getId()));
				System.out.println("criteria.add");
			}
			if (null!=employee.getCode() &&
					String.valueOf(employee.getCode()).trim().length()>0){
				
				criteria.add(Restrictions.eq("code",employee.getCode()));
			}
			if (null!=employee.getName() &&
					String.valueOf(employee.getName()).trim().length()>0){
				
				criteria.add(Restrictions.eq("name",employee.getName()));
			}
		}		
		list1= this.getHibernateTemplate().findByCriteria(criteria);
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("dao list1.size()="+list1.size());
			return list1;
		}		
	}

	@Override
	public void saveEmployee(Employee employee) {
	
		//this.getHibernateTemplate().save(employee);
		Session session = this.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
	}

	@Override
	public void updateEmployee(Employee employee) {
			Integer eid=employee.getId();
			HibernateTemplate  hibernateTemplate =  this.getHibernateTemplate();	
		
			//Employee perstEmployee =(Employee) hibernateTemplate.load(Employee.class, Integer.valueOf(eid));
				Employee perstEmployee =(Employee) hibernateTemplate.get(Employee.class, Integer.valueOf(eid));
			System.out.println(" 3 dao---updateEmployee--perstEmployee.code="+perstEmployee.getCode());

			
			perstEmployee.setCode(employee.getCode());
			perstEmployee.setName(employee.getName());
			
			perstEmployee.setBirthday(employee.getBirthday());
			perstEmployee.setSex(employee.isSex());
			perstEmployee.setEmail(employee.getEmail());
			
	
			perstEmployee.setBirthday(employee.getBirthday());			
			
			hibernateTemplate.update(perstEmployee);
			this.getSession().flush();
			//为什么不能是hibernateTemplate.update(employee);?
			
			//因为perstEmployee是从数据库取出来的 是和数据库有关联的  对象。。。
			//补充hibernate对象的几个状态。
		
	}	
}
