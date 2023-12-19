package com.ty;

public class Mobile {

	private String name;
	
	private String model;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	public void ring()
	{
		System.out.println("Mobile Is Ringin"+name);
	}
	
}
