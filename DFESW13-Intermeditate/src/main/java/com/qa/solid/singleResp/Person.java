package com.qa.solid.singleResp;

public class Person {
	
	private String name;
	private String musicTaste; 
	private int age;
	
	public Person(String name, String musicTaste, int age) {
		super();
		this.name = name;
		this.musicTaste = musicTaste;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMusicTaste() {
		return musicTaste;
	}

	public void setMusicTaste(String musicTaste) {
		this.musicTaste = musicTaste;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
