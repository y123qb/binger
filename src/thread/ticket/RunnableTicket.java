package thread.ticket;

public class RunnableTicket implements Runnable{

	private int ticketCount=5;
	private String nameStr;
	private long time=0;
	@Override
	public void  run() {
		if(time!=0){
			synchronized(this){
				sellTicket();
			}
		}else{
			sellTicket();
		}
	}
	private void sellTicket() {
		for(int i=0;i<10;i++){
			if(ticketCount>0){
				System.out.println(this.nameStr+"------:"+ticketCount--);
			}
			try {
				if(time!=0){
					Thread.sleep(time);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public RunnableTicket(String nameStr) {
		super();
		this.nameStr = nameStr;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}

	
}
