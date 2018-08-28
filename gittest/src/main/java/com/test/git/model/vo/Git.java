package com.test.git.model.vo;

public class Git {

	private String id;
	private String password;
	
	public Git() {
		
	}

	public Git(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Git [id=" + id + ", password=" + password + "]";
	}
	
}
