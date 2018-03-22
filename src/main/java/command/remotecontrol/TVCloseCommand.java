package command.remotecontrol;

public class TVCloseCommand extends AbstractCommand {
	// 依赖的Television对象
	private Television tv;

	public TVCloseCommand() {
		this.tv = new Television();
	}

	@Override
	public void execute() {
		tv.close();
	}

}