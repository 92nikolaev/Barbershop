package by.nikolaev.ilya.barbershop.bean;

import java.io.Serializable;

public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String login;
	private String password;
	private boolean status;

	public String getName() {
		return name;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
