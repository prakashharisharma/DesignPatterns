package com.td.dp.builder1;

public class BuilderTest {

	public static void main(String[] args) {
		Person person = new Person.PersonBuilder().setName("Prakash").setAge(32).build();

		System.out.println(person);

		person = new Person.PersonBuilder().setName("Prakash").setAge(32).setAddress("Noida").setQualification("PG")
				.build();
		System.out.println(person);
	}
}
