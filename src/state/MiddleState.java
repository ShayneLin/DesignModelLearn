package state;

//具体状态类（高手状态类）
public class MiddleState extends AbstractState {

	// 初始化环境对象的引用
	MiddleState(AbstractState state) {
		this.acc = state.acc;
		this.point = state.getPoint();
		this.stateName = "高手";
	}

	MiddleState(ForumAccount acc) {
		this.point = 0;
		this.acc = acc;
		this.stateName = "高手";
	}

	@Override
	public void writeNote(int score) {
		System.out.println(acc.getName() + "发布留言、增加" + score + "*2积分。");
		this.point += score * 2;
		// 积分增加了，需要检查状态是否该改变
		checkState(point);
		System.out.println("剩余积分为：" + this.point + "、当前级别为："
				+ acc.getState().stateName + "。");
	}

	/**
	 * score用来当不够积分时，不能下载那么应该将score加回去
	 */
	@Override
	public void checkState(int score) {
		if (point >= 1000) {
			// 这个this也关联了ForumAccount
			acc.setState(new HighState(this));
		} else if (point <= 0) {
			System.out.println("余额不足，下载文件失败！");
			this.point += score;
		} else if (point <= 100) {
			acc.setState(new PrimaryState(this));
		}
	}

}
