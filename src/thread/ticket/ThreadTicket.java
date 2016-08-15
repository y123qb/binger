package thread.ticket;

public class ThreadTicket extends Thread{

	private String nameStr;
	private int ticketCount=5;

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			if(ticketCount>0){
				System.out.println(this.nameStr+"-----"+this.ticketCount--);
			}
		}
	}

	public ThreadTicket(String nameStr) {
		super();
		this.nameStr = nameStr;
	}
	
}
