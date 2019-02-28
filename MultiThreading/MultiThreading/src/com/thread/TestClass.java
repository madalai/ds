package com.thread;

public class TestClass {
	IAnimal obj;

	void test() {
		IAnimal obj = getAnimal();
		obj.makeSound();
	}

	public void setAnimal(IAnimal obj) {
		this.obj = obj;
	}

	public IAnimal getAnimal() {
		// TODO Auto-generated method stub
		return obj;
	}

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		obj.setAnimal(new Dog());
		obj.test();
		
		obj.setAnimal(new Cat());
		obj.test();
	}
}
