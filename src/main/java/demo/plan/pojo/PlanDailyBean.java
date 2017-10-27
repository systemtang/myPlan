package demo.plan.pojo;

import java.util.Date;
import java.util.List;

public final class PlanDailyBean extends PlanBaseBean {

	private Date startTime;
	private Date endTime;
	private int point;
	private boolean state;
	private List<PlanItem> planItems;
	private Date updateTime;
	
	public PlanDailyBean(long planId, String planName, Date createTime) {
		super(planId, planName, createTime);
	}

	public PlanDailyBean(long planId, String planName, Date createTime, Date startTime, Date endTime, int point,
			boolean state, List<PlanItem> planItems, Date updateTime) {
		super(planId, planName, createTime);
		this.startTime = startTime;
		this.endTime = endTime;
		this.point = point;
		this.state = state;
		this.planItems = planItems;
		this.updateTime = updateTime;
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

	@java.lang.Override
	public java.lang.String toString() {
		return "planDailyBean{" +
				"startTime=" + startTime +
				", endTime=" + endTime +
				", point=" + point +
				", state=" + state +
				", planItems=" + planItems +
				", updateTime=" + updateTime +
				'}';
	}
}