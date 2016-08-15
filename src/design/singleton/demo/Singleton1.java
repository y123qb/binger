package design.singleton.demo;

/**
 * @author binger
 * 跟singleton2一样都是单例模式。这个是懒汉式（因为他懒所以自己不去创建，只有别人调用的时候才去创建，懒啊）
 * 提供一个自己类的对象，设为私有，对外提供一个接口，以供外部调用，在人家调用的时候创建，这也体现封装性
 */
public class Singleton1 {

	private static Singleton1 singleton;
	public static Singleton1 getInstance(){
		if(singleton==null){
			singleton = new Singleton1();
		}
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
