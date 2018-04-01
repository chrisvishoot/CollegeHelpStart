package com.vishooter.collegehelp.demo.models;

import javax.persistence.*;

@Entity
@Table(name="richter.greeting")
public class Greeting {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String content;

	public Greeting() {

	}
	
	public Greeting(int id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public int getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
}
