package command.simple;

public class Test {
	public static void main(String args[]){
		//创建一个调用者
		Invoker invoker = new Invoker(new ConcreteCommand(new Receiver()));
		invoker.call();
	}

}
