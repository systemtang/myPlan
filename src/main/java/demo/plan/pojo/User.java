package src.main.java.demo.plan.pojo;

/**
 * 用户基础类<br>
 * 仅包含最基本信息，主要用来验证用户
 * 
 * @author tangrj001
 *
 */
public class User {

	private long userId; // 用户id，应该对外隐藏
	private long userNo; // 用户唯一识别号，可以对外公开
	private String userName; // 用户登录账户
	private String userPwd; // 用户登录密码

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getUserNo() {
		return userNo;
	}

	public void setUserNo(long userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

}
