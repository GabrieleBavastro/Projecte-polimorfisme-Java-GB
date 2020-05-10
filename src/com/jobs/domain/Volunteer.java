package com.jobs.domain;

public class Volunteer extends AbsStaffMember {

	protected String description;

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);

		if (description == "")
			throw new Exception("Please insert a comment!");
		if (description == null)
			throw new Exception("Please insert a comment!");

		this.description = description;
	}

	@Override
	public void pay() {

	}
}
