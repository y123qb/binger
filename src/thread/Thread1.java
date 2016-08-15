package thread;

/***
 * 
 * @author binger
 * 实现线程的一种方式继承teread类，创建一个线程，重写父类的run方法，在里面
 * 实现自己的逻辑，等待其他调用
 */
public class Thread1 extends Thread{

	@Override
	public void run() {
		System.out.println("---extends Thread class---实现自己的逻辑");
		super.run();
	}

	
}
