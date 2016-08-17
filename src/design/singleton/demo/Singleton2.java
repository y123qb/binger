package design.singleton.demo;

/**
 * @author binger
 * 饿汉式（这个比较饿啊，所以自己先创建对象了，外部调用直接返回给自己创建的这个对象，饿了自己动手）
 * 提供一个自己类的对象，设为私有，对外提供一个接口，以供外部调用，这也体现封装性
 */
public class Singleton2 {

	private static final Singleton2 singleton = new Singleton2();
	
	public static Singleton2 getInstance(){
		return singleton;
	}
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
