package entity;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	public Employee() {
		super();

	}
	public Employee(String code, String name, String birthday, boolean sex,
			String telephone, String email) {
		super();
		this.code = code;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.telephone = telephone;
		this.email = email;
	//	this.stockins = stockins;
	//	this.stockorders = stockorders;
	}
	public Employee(String code, String name, String birthday, boolean sex,
			String telephone) {
		super();
		this.code = code;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.telephone = telephone;
	
	}
	private Integer id;
	private String code;
	private String   name;
	private String birthday;
	private boolean sex;
	private String telephone;
	private String email;
/*	private Set stockins = new HashSet(0);
	private Set stockorders = new HashSet(0);*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
	
		if (null!= birthday && birthday.length()>=0){
			birthday =birthday.substring(0,10);
		}
		this.birthday=birthday;
	}

	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
/*	public Set getStockins() {
		return stockins;
	}
	public void setStockins(Set stockins) {
		this.stockins = stockins;
	}
	public Set getStockorders() {
		return stockorders;
	}
	public void setStockorders(Set stockorders) {
		this.stockorders = stockorders;
	}
	*/
	
}
