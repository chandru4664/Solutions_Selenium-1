package htc.training.homework;

public class Person {
	private String name;
	private int age;
	private String maritalstts;
	
	public Person(String name, int age, String maritalstts) {
		this.name = name;
		this.age = age;
		this.maritalstts = maritalstts;
	}

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

	public String getMaritalstts() {
		return maritalstts;
	}

	public void setMaritalstts(String maritalstts) {
		this.maritalstts = maritalstts;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", maritalstts=" + maritalstts + "]";
	}
	
	

}
