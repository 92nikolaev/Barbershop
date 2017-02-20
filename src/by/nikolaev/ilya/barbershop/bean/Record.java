package by.nikolaev.ilya.barbershop.bean;

import java.io.Serializable;

public class Record implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String time;
	private String data;
	private String phone;
	private int userId;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTime() {
		return time;
	}

	public String getData() {
		return data;
	}

	public String getPhone() {
		return phone;
	}

	public int getUserId() {
		return userId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
