package proxy.cglib;

public class User {

	private String name;
	private int age;
	public void eat() {
		System.out.println("我"+name+"就知道吃，尽管我今年已经"+age);
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

}
