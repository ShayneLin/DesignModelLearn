package command.simple;

//具体的命令实现类,依赖于Receiver
public class ConcreteCommand extends Command {
	private Receiver receiver;

	//这里不应该提供receiver的注入方法，否则客户就需要知道接受者了
	public ConcreteCommand(Receiver receiver) {
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.action();
	}

}
