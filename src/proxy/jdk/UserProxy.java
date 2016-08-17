package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 创建代理类，单纯的创建代理类，就那一个方法。我们可以在执行委托类自身方法method.invoke(object, args)前后加自己的逻辑
 * @author binger
 *
 */
public class UserProxy implements InvocationHandler {

	public Object object;//定义变量绑定要代理的类：委托类
	
	public UserProxy(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("在吃之前先洗手吧");
		method.invoke(object, args);//委托类执行自己的方法
		System.out.println("吃完也要洗手");
		return null;
	}

}
