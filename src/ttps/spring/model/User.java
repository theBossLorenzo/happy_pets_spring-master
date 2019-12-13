package ttps.spring.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class User {
	public String user_name;
	public String user_password;
	public String user_surname;
	public String user_phone;
	public String user_mail;
	
	public User() {
	}

	public User(String name, String password, String surname, String phone, String mail) {
		this.user_name = name;
		this.user_password = password;
		this.user_surname = surname;
		this.user_phone = phone;
		this.user_mail = mail;
	}
	
	public String getName() {
		return user_name;
	}
	public void setName(String name) {
		this.user_name = name;
	}
	public String getPassword() {
		return user_password;
	}
	public void setPassword(String password) {
		this.user_password = password;
	}
	public String getSurname() {
		return user_surname;
	}
	public void setSurname(String surname) {
		this.user_surname = surname;
	}
	public String getPhone() {
		return user_phone;
	}
	public void setPhone(String phone) {
		this.user_phone = phone;
	}
	public String getMail() {
		return user_mail;
	}
	public void setMail(String mail) {
		this.user_mail = mail;
	}
	
	

}
