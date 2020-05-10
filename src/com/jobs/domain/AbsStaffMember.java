package com.jobs.domain;

public abstract class AbsStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid;

	private static int COUNTER_MEMBERS = 1;

	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals(""))
			throw new Exception("Name field not filled! Please fill it in!");
		if (address.equals(""))
			throw new Exception("Adress field not filled! Please fill it in!");
		if (phone.equals(""))
			throw new Exception("Phone field not filled! Please fill it in!");

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	public abstract void pay();

	@Override
	public String toString() {
		return "Id: " + id + " - Name: " + name + " Adress: " + address + ". Phone number: " + phone + ". Salary: " + totalPaid + "€ \n";
	}
}