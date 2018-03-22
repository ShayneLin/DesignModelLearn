package state;

//环境类（论坛帐号类）
public class ForumAccount {
	private AbstractState state;
	private String name;// 账户名

	public ForumAccount(String name) {
		this.name = name;
		// 刚刚开始的时候默认是初级用户
		// state = new PrimaryState(this);
		System.out.println(this.name + "注册成功");
		state = new PrimaryState(this);
		System.out
				.println("-------------------------------------------------------------");
	}

	public void setState(AbstractState state) {
		this.state = state;
	}

	public AbstractState getState() {
		return state;
	}

	public String getName() {
		return name;
	}

	// 下载
	public void downloadFile(int score) {
		state.downloadFile(score);
	}

	// 留言或评论
	public void writeNote(int score) {
		state.writeNote(score);
	}

	// 回复评论
	public void replyNote(int score) {
		state.replyNote(score);
	}

}
