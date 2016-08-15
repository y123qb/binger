package design.observer.demo;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author binger
 * 主题（被观察的对象),里面有一些属性和三个方法：添加、删除观察者和给观察者下通知。
 * 通知就是循环遍历观察者，然后调用他们的方法
 */
public class Customer implements ICustomer {

	private String name;
	private String statu;
	private List<Servicer> observers ;
	
	
	public Customer(String name) {
		super();
		this.name = name;
		this.observers = new ArrayList<Servicer>();
		this.statu="0";
	}

	public void addObserver(Servicer servicer) {
		observers.add(servicer);
	}

	public void delObserver(Servicer servicer) {
		observers.remove(servicer);
	}

	public void notifyObserver(Customer customer) {
		for (Servicer iServicer : observers) {
			iServicer.update(customer);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatu() {
		return statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
	}

	
}
