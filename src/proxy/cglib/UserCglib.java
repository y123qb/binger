package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class UserCglib implements MethodInterceptor,InvocationHandler{

	private Object target;
	
	
	public UserCglib(Object target) {
		super();
		this.target = target;
	}


	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
//		System.out.println("在吃之前先洗手吧");
//		arg1.invoke(target, arg2);//委托类执行自己的方法
//		arg3.invoke(target, arg2);//委托类执行自己的方法
//		System.out.println("吃完也要洗手");
		return null;
	}


	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		System.out.println("在吃之前先洗手吧");
		arg1.invoke(target, arg2);//委托类执行自己的方法
		System.out.println("吃完也要洗手");
		return null;
	}

}
