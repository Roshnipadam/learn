package com.javabasic;

public class Emp {
	int id;
	String name;
	Address address;
	public Emp(int id,String name, Address address) {
		this.id =id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println(id+""+name);
		System.out.println(address.city+""+address.state+"address.country");
	}

	public static void main(String[] args) {
		Address address1= new Address("up","gurdaspur","delhi");
		Address address2= new Address("bihar","india","jalandhr");
		Emp rosh= new Emp(11,"varun",address1);
		Emp roshh= new Emp(12,"sidh",address1);
		rosh.display();
		roshh.display();  
		// TODO Auto-generated method stub

	}

}
