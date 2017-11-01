package demo.plan.pojo;

import java.util.Date;
import java.util.List;

/**
 * @author tangrj001
 *
 */
public final class PlanDailyBean {

	private long planId; // 任务ID，每个任务唯一
	private String planName; // 任务名称，用于简单的表示任务
	private Date createTime; // 任务创建时间
	private Date startTime;
	private Date endTime;
	private int point;
	private boolean state;
	private List<PlanItem> planItems;
	private Date updateTime;
	
	public PlanDailyBean(long planId, String planName, Date createTime, Date startTime, Date endTime, int point,
			boolean state, List<PlanItem> planItems, Date updateTime) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.createTime = createTime;
		this.startTime = startTime;
		this.endTime = endTime;
		this.point = point;
		this.state = state;
		this.planItems = planItems;
		this.updateTime = updateTime;
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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public List<PlanItem> getPlanItems() {
		return planItems;
	}

	public void setPlanItems(List<PlanItem> planItems) {
		this.planItems = planItems;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "PlanDailyBean [planId=" + planId + ", planName=" + planName + ", createTime=" + createTime
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", point=" + point + ", state=" + state
				+ ", planItems=" + planItems + ", updateTime=" + updateTime + "]";
	}

}
