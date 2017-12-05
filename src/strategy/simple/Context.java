package strategy.simple;

//环境类，维护了一个对抽象策略类的引用实例
public class Context {
	private AbstractStrategy strategy;

	public void setStrategy(AbstractStrategy strategy) {
		this.strategy = strategy;
	}

	public void algorithm() {
		strategy.algorithm();
	}

}
