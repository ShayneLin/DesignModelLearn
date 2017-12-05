package decoration.transform;

//具体装饰类（飞机类） 虽然是避免的通过对继承Car来增加新行为但是不也是通过继承Changer类
//呵呵 还不是由继承来解决问题，也许就仅仅要具体构建类不能继承就好 二哈。
public class Airplane extends Changer {

	public Airplane(Transform transform) {
		super(transform);
		System.out.println("变成飞机了！");
	}

	
	public void fly(){
		System.out.println("在天空中飞翔！");
	}
}
