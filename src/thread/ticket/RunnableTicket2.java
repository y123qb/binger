package thread.ticket;

public class RunnableTicket2 implements Runnable{

	private int ticketCount=5;
	private String nameStr;
	@Override
	public void  run() {
			synchronized(this){//如果想看线程安全问题可以把这个代码注释掉。多运行几次就会发现了
				sellTicket();
			}
	}
	private void sellTicket() {
		for(int i=0;i<10;i++){
			if(ticketCount>0){
				for(int n=0;n<5000;n++){
					String num = "1"+"1";
				}
				System.out.println(this.nameStr+"------:"+ticketCount--);
			}
		}
	}
	public RunnableTicket2(String nameStr) {
		super();
		this.nameStr = nameStr;
	}
	
}
