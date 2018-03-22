package command.simple;

//调用者
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		// TODO Auto-generated constructor stub
		this.command = command;
	}

	// 用于注入Command对象
	public void setCommand(Command command) {
		this.command = command;
	}

	// 调用该方法执行命令对象的方法，但是不知道命令对象干了什么
	public void call() {
		command.execute();
	}
}
