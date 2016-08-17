package base.withinClass;

public class OutClass {

	private String name;
	private int age;
	public String inner(final String move){
		InnerInterface inner = new InnerInterface(){
			public String eat(String name, int age) {
				System.out.println("我是"+name+",我今年"+age+"了，不要说我光知道吃");
				name="李四";
				return name;
			}

			public void pig(String name,String newname) {
				System.out.println("我不是猪,不要总说我"+move+"我的名字是"+name+"改名字后是"+newname);
			}
			
		};
		String newName = inner.eat(name, age);
		inner.pig(name,newName);
		return "名字修改后"+newName;
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
