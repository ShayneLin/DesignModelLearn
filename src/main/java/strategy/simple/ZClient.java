package strategy.simple;

public class ZClient {
	public static void main(String args[]) {
		Context context = new Context();
		AbstractStrategy strategy;
		// 策略A
		strategy = new ConcreteStrategyA();
		context.setStrategy(strategy);
		context.algorithm();

		// 策略B
		strategy = new ConcreteStrategyB();
		context.setStrategy(strategy);
		context.algorithm();
	}

}
