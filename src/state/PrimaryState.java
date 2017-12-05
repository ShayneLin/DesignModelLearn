package state;

//具体状态类（新手状态类）
public class PrimaryState extends AbstractState {

	// 初始化环境对象的引用
	public PrimaryState(AbstractState state) {
		this.acc = state.acc;
		this.point = state.getPoint();
		this.stateName = "新手";
	}

	public PrimaryState(ForumAccount acc) {
		this.point = 0;
		this.acc = acc;
		this.stateName = "新手";
	}

	// 因为级别不够无法下载
	@Override
	public void downloadFile(int score) {
		System.out.println("对不起，" + acc.getName() + ",你没有下载文件的权限！");
	}

	/**
	 * score用来当不够积分时，不能下载那么应该将score加回去
	 */
	@Override
	public void checkState(int score) {
		if (point > 1000) {
			// 这个this也关联了ForumAccount
			acc.setState(new HighState(this));
		} else if (point >= 100) {
			acc.setState(new MiddleState(this));
		}
	}

}
