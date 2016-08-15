package design.observer.demo;

/***
 * 
 * @author binger
 * 定义主题接口 解耦合
 *
 */
public interface ICustomer {

	void addObserver(Servicer servicer);
	void delObserver(Servicer servicer);
	void notifyObserver(Customer customer);
}
