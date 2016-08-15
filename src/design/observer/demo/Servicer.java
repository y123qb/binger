package design.observer.demo;
/***
 * 
 * @author binger
 * 观察者类，定义属性和一个执行操作的方法，更新。当监听到主题对象发生变化时执行自己的方法
 *
 */
public class Servicer implements IServicer {

	private String name;
	private String job;
	public void update(Customer customer) {
		System.out.println("我是"+name+",我监听到客户"+customer.getName()+"状态"+customer.getStatu()+"我要"+job);

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Servicer(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

}
