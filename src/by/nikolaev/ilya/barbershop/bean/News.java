package by.nikolaev.ilya.barbershop.bean;

import java.io.Serializable;
import java.sql.Date;

public class News implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String title;
	private Date date;
	private String content;

	public String getTitle() {
		return title;
	}

	public Date getDate() {
		return date;
	}

	public String getContent() {
		return content;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
