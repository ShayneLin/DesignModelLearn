package command.remotecontrol;

public class TVChangeCommand extends AbstractCommand {
	// 依赖的Television对象
	private Television tv;

	public TVChangeCommand() {
		this.tv = new Television();
	}

	@Override
	public void execute() {
		tv.change();
	}

}