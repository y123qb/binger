package thread;

/***
 * 
 * @author binger
 * 实现线程的领一种方式实现Runable接口，创建一个线程，重写接口的run方法，在里面
 * 实现自己的逻辑，等待其他调用
 */
public class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("----implements Runnable interface ---实现自己的逻辑");
		
	}

}
