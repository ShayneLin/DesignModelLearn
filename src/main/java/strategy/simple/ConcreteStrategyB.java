package strategy.simple;

//策略B
public class ConcreteStrategyB extends AbstractStrategy {

	@Override
	public void algorithm() {
		System.out.println("使用算法B解决");
	}

}
