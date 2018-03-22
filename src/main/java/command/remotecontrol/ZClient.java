package command.remotecontrol;

public class ZClient {
	public static void main(String args[]) {
		// 1.创建命令对象
		TVChangeCommand changeCommand = new TVChangeCommand();
		TVCloseCommand closeCommand = new TVCloseCommand();
		TVOpenCommand openCommand = new TVOpenCommand();
		// 2.创建遥控器对象，即调用者或发送者，传递参数
		Controller controller = new Controller(openCommand, closeCommand,
				changeCommand);
		// 3.测试
		controller.open();
		controller.change();
		controller.close();

	}

}
