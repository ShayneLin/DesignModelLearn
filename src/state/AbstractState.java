package state;

//抽象状态类（帐号状态类）
public abstract class AbstractState {
	protected ForumAccount acc;
	protected int point;
	protected String stateName;

	// 检查状态的方法，通过对状态的判断，更改ForumAccount的状态对象，从而实现不同用户
	// 拥有不同的操作
	public abstract void checkState(int score);

	public void downloadFile(int score) {
		System.out.println(acc.getName() + "下载文件，扣除" + score + "积分。");
		this.point -= score;
		// 积分减少了，需要检查状态是否该改变
		checkState(score);
		System.out.println("剩余积分为：" + this.point + "、当前级别为："
				+ acc.getState().stateName + "。");
	}

	public void writeNote(int score) {
		System.out.println(acc.getName() + "发布留言、增加" + score + "积分。");
		this.point += score;
		// 积分增加了，需要检查状态是否该改变
		checkState(score);
		System.out.println("剩余积分为：" + this.point + "、当前级别为："
				+ acc.getState().stateName + "。");
	}

	public void replyNote(int score) {
		System.out.println(acc.getName() + "回复留言、增加" + score + "积分。");
		this.point += score;
		// 积分增加了，需要检查状态是否该改变
		checkState(point);
		System.out.println("剩余积分为：" + this.point + "、当前级别为："
				+ acc.getState().stateName + "。");
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
