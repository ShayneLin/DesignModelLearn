package command.remotecontrol;

public class TVOpenCommand extends AbstractCommand {
	// 依赖的Television对象
	private Television tv;

	public TVOpenCommand() {
		this.tv = new Television();
	}

	@Override
	public void execute() {
		tv.open();
	}

}
