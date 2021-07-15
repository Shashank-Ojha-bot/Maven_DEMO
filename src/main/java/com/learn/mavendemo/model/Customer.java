package com.learn.mavendemo.model;

import java.util.Map;

public class Customer {
	private int id;
	private String name;
	private Map<String,Integer> products;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, Map<String, Integer> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
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
	public Map<String, Integer> getProducts() {
		return products;
	}
	public void setProducts(Map<String, Integer> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", products=" + products + "]";
	}
	
}
