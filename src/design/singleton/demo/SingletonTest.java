package design.singleton.demo;

/**
 * @author binger
 * 看变化，只要获取单例的对象。不管怎么赋值最终结果都一样（最后那个赋值），打印日志可以看到：这两个对象的内存地址是一样的
 */
public class SingletonTest {

	public static void main(String[] args) {
		// 懒汉式
		Singleton1 singleton1_1 = Singleton1.getInstance();
		singleton1_1.setName("张三");
		Singleton1 singleton1_2 = Singleton1.getInstance();
		singleton1_2.setName("李四");
		System.out.println(singleton1_1.getName()+"---"+singleton1_2.getName());
		System.out.println(singleton1_1);
		System.out.println(singleton1_2);
		
		// 饿汉式
		Singleton2 singleton2_1 = Singleton2.getInstance();
		singleton2_1.setName("张三");
		Singleton2 singleton2_2 = Singleton2.getInstance();
		singleton2_2.setName("李四");
		System.out.println(singleton2_1.getName()+"---"+singleton2_2.getName());
		System.out.println(singleton2_1);
		System.out.println(singleton2_2);
		
	}

}
