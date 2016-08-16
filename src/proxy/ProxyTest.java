package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		User user = new User();
		user.setAge(18);
		user.setName("张三");
		InvocationHandler handler = new UserProxy(user);//创建一个代理类
		//下面是获取代理类的操作类Proxy，获取了它才可以执行代理类啊。参数就那几个了，此处注意的是一定要强制转换一下接口，因为委托类的接口才能调用委托类的方法
		IUser proxyUser = (IUser)Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass().getInterfaces(), handler);
		proxyUser.eat();//其实也是用了java的多态，委托类跟代理类都实现相同的接口。所以才可以调用共同的方法
	}
}
