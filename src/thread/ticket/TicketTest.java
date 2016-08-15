package thread.ticket;

public class TicketTest {

	public static void main(String[] args) {
		ThreadTicket ticket1 = new ThreadTicket("售票口1");
		ThreadTicket ticket2 = new ThreadTicket("售票口2");
		ThreadTicket ticket3 = new ThreadTicket("售票口3");
//		ticket1.start();
//		ticket2.start();
//		ticket3.start();
		
		System.out.println("==============用Runnable接口实现线程============================");
		System.out.println("----------例子1：最简单的多线程例子-----------------");
		RunnableTicket ticket = new RunnableTicket("票总库房");
		Thread thread1 = new Thread(ticket);
		Thread thread2 = new Thread(ticket);
		Thread thread3 = new Thread(ticket);
//		thread1.start();
//		thread2.start();
//		thread3.start();
		System.out.println("----------例子2：线程安全的问题-----------------");
		//以上Runnable接口实现的线程还是少，对于数据安全方面不明显。多个线程的时候可能存在A线程访问变量值并改变值。但B线程还用的之前的值
		//给线程加个睡眠时间可以模拟看一下
		ticket.setTime(3000);
//		thread1.start();
//		thread2.start();
//		thread3.start();
		System.out.println("----------例子3：线程安全的问题-----------------");
		//以上Runnable接口实现的线程还是少，对于数据安全方面不明显。多个线程的时候可能存在A线程访问变量值并改变值。但B线程还用的之前的值
		//用很多线程访问的时候模拟一下
		RunnableTicket2 ticket0 = new RunnableTicket2("票总库房");
		for(int i=0;i<20;i++){
			Thread thread0 = new Thread(ticket0);
			thread0.start();
		}
	}
}
