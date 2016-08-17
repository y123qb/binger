package proxy.cglib;


import proxy.jdk.User;
import proxy.jdk.UserProxy;
import net.sf.cglib.*;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

public class CglibTest {

	public static void main(String[] args) {
		User user = new User();
		user.setAge(18);
		user.setName("李四");
		InvocationHandler handler =  new UserCglib(user);//创建一个代理类
		User u = (User)Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass(), handler);
		u.eat();
	}

}
