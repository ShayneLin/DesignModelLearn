package command.remotecontrol;

//调用者即遥控器，依赖于AbstractCommand的子类对象
public class Controller {
	private AbstractCommand openCommand;
	private AbstractCommand closeCommand;
	private AbstractCommand changeCommand;

	public Controller(AbstractCommand openCommand,
			AbstractCommand closeCommand, AbstractCommand changeCommand) {
		super();
		this.openCommand = openCommand;
		this.closeCommand = closeCommand;
		this.changeCommand = changeCommand;
	}

	// 打开电视
	public void open() {
		openCommand.execute();
	}

	public void close() {
		closeCommand.execute();
	}

	public void change() {
		changeCommand.execute();
	}

}
