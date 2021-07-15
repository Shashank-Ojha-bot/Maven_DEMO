package com.learn.mavendemo.model;

import java.util.List;

public class Cart {
	private int id;
	private String name;
	private List<MenuItem> menuItemList;
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	public Cart(int id, String name, List<MenuItem> menuItemList) {
		super();
		this.id = id;
		this.name = name;
		this.menuItemList = menuItemList;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}
	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", menuItemList=" + menuItemList + "]";
	}
	
	

}
