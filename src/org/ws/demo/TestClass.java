package org.ws.demo;
class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
		public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(int age) {
		super();
		this.age = age;
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "ĞÕÃû£º"+this.name+"; Äêıg£º"+this.age;
	}
	
	
	
}
public class TestClass {

	public static void main(String[] args) {
		System.out.println(new Person("ÍõË¸",24));

	}

}
