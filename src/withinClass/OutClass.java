package base.withinClass;

public class OutClass {

	private String name;
	private int age;
	public String inner(final String move){
		InnerInterface inner = new InnerInterface(){
			public String eat(String name, int age) {
				System.out.println("����"+name+",�ҽ���"+age+"�ˣ���Ҫ˵�ҹ�֪����");
				name="����";
				return name;
			}

			public void pig(String name,String newname) {
				System.out.println("�Ҳ�����,��Ҫ��˵��"+move+"�ҵ�������"+name+"�����ֺ���"+newname);
			}
			
		};
		String newName = inner.eat(name, age);
		inner.pig(name,newName);
		return "�����޸ĺ�"+newName;
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
