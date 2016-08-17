package design.observer.demo;

/***
 * 
 * @author 冰儿binger
 * 一个很简单的观察者模式：客户是一个主题。他添加了一些他的观察者(客服啊、库房啊、老板啊)。而他们这些都是观察者。他们时刻观察者顾客动静
 * 当顾客执行操作时他们也就收到了相应的指令
 * 实现思路：客户那有个容器，把他的观察者添加进去。当客户改变时给他的观察者门下通知。循环调用观察者的方法。观察者就知道该干嘛了
 *
 */
public class ObseverTest {

	public static void main(String[] args) {
		Servicer servicer1 = new Servicer("客服","怂恿付钱");
		Servicer servicer2 = new Servicer("库房","准备好货，随时发");
		Servicer servicer3 = new Servicer("老板","客户的钱");
		Customer customer1 = new Customer("客户1");
		customer1.setStatu("下单");
		customer1.addObserver(servicer1);
		customer1.addObserver(servicer2);
		customer1.addObserver(servicer3);
		customer1.notifyObserver(customer1);

		Customer customer2 = new Customer("客户2");
		customer2.setStatu("付钱");
		servicer1.setJob("客户付的钱，我还要奖金");
		servicer2.setJob("我就老实的发货呗");
		servicer3.setJob("客户的钱，不给客服奖金");
		customer2.addObserver(servicer1);
		customer2.addObserver(servicer2);
		customer2.addObserver(servicer3);
		customer2.notifyObserver(customer2);
	}
}
