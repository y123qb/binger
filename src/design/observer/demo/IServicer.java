package design.observer.demo;

/***
 * 定义观察者的接口 解耦合 里面就一个方法更新
 * @author 冰儿
 *
 */
public interface IServicer {
	void update(Customer customer);
}
