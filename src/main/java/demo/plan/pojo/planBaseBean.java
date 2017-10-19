package demo.plan.pojo;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * 基础任务类
 * 
 * @author Administrator
 *
 */
public class planBaseBean {
	private long planId; // 任务ID，每个任务唯一
	private String planName; // 任务名称，用于简单的表示任务
	private Date createTime; // 任务创建时间

	public planBaseBean(long planId, String planName, Date createTime){
		if(createTime == null){
			createTime = new Date();
		}
		this.planId = planId;
		this.planName = planName;
		this.createTime = createTime;
	}
	
	public long getPlanId() {
		return planId;
	}

	public void setPlanId(long planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return ""
				+ "任务ID:" + String.valueOf(planId)
				+ ",任务名:" + planName
				+ ",创建时间:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createTime);
	}
	
}
