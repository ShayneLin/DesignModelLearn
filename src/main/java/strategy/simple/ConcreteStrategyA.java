package strategy.simple;

//策略A
public class ConcreteStrategyA extends AbstractStrategy {

	@Override
	public void algorithm() {
		System.out.println("使用算法A解决");
	}

}
