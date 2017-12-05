package decoration.transform;

//抽象装饰者类（变化类）很关键
public class Changer implements Transform {
	private Transform transform;

	// 他能成为装饰类的关键是将Tranform对象作为了引用
	// (然而最让人疑惑的是Chnager它有那个必要实现Transform接口吗,也许是为了统一保留
	// 的move方法吧)
	public Changer(Transform transform) {
		this.transform = transform;
	}

	@Override
	public void move() {
		transform.move();
	}
}
