package com.td.dp.builder1;

public class Person {

	private String name;
	private String Address;
	private int age;
	private String qualification;
	
	private Person(PersonBuilder builder) {
		this.name = builder.name;
		this.Address = builder.Address;
		this.age = builder.age;
		this.qualification = builder.qualification;
	}
	
	public static class  PersonBuilder{
		private String name;
		private String Address;
		private int age;
		private String qualification;
		
		public PersonBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public PersonBuilder setAddress(String address) {
			this.Address = address;
			return this;
		}

		public PersonBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public PersonBuilder setQualification(String qualification) {
			this.qualification = qualification;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", Address=" + Address + ", age=" + age + ", qualification=" + qualification
				+ "]";
	}
	
	
	
}
