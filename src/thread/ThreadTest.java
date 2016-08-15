package thread;

public class ThreadTest {

	public static void main(String[] args) {
		//thread由自己创建，里面必须重写run()方法，这个是执行逻辑必须的方法
		Thread1 thread1=new Thread1();
		thread1.run();//线程开始
		
		//即使实现的runnable接口也必须由线程本身启动，所以此处创建线程的实例
		Thread thread2 = new Thread(new Thread2());
		thread2.start();

	}

}
