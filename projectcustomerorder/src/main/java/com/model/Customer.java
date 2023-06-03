package com.model;

public class Customer {
	
	private int cid;
	private String cname;
	
	private Product product;

	public Customer() {
		super();
	}
	
	public Customer(int cid, String cname, Product product) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.product = product;
	}

	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void display()
	{
		System.out.println("Customer ID : "+cid);
		System.out.println("Customer Name : "+cname);
		System.out.println("Product Details : "+product);
	}
}
