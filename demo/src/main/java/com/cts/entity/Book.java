package com.cts.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
@Entity
@Table(name="book_table")
public class Book {
	public Book() {
		super();
	}



	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="title",length=50)
	String title;
	
	@Column(name="password",length=100)
	String password;

	public Book(int id, String title, String password) {
		super();
		this.id = id;
		this.title = title;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Book(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", password=" + password + "]";
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}






	

}
