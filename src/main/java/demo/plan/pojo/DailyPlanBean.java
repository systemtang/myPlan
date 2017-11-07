package demo.plan.pojo;

import java.util.Date;
import java.util.List;

/**
 * @author tangrj001
 *
 */
public final class DailyPlanBean {

	private long planId; // 任务ID，每个任务唯一
	private String planName; // 任务名称，用于简单的表示任务
	private Date createTime; // 任务创建时间
	private Date startTime;
	private Date endTime;
	private int point;
	private boolean state;
	private List<PlanItem> planItems;
	private int itemSize;
	private Date updateTime;
	
	public DailyPlanBean () {}

	
	public int getItemSize() {
		return itemSize;
	}

	public long getPlanId() {
		return planId;
	}
	public String getPlanName() {
		return planName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public Date getStartTime() {
		return startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public int getPoint() {
		return point;
	}
	public boolean isState() {
		return state;
	}
	public List<PlanItem> getPlanItems() {
		return planItems;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public DailyPlanBean setPlanId(long planId) {
		this.planId = planId;
		return this;
	}
	public DailyPlanBean setPlanName(String planName) {
		this.planName = planName;
		return this;
	}
	public DailyPlanBean setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}
	public DailyPlanBean setStartTime(Date startTime) {
		this.startTime = startTime;
		return this;
	}
	public DailyPlanBean setEndTime(Date endTime) {
		this.endTime = endTime;
		return this;
	}
	public DailyPlanBean setPoint(int point) {
		this.point = point;
		return this;
	}
	public DailyPlanBean setState(boolean state) {
		this.state = state;
		return this;
	}
	public DailyPlanBean setPlanItems(List<PlanItem> planItems) {
		this.planItems = planItems;
		return this;
	}
	
	public DailyPlanBean setItemSize(int itemSize) {
		this.itemSize = itemSize;
		return this;
	}
	
	public DailyPlanBean setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	@Override
	public String toString() {
		return "DailyPlanBean [planId=" + planId + ", planName=" + planName + ", createTime=" + createTime
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", point=" + point + ", state=" + state
				+ ", planItems=" + planItems + ", itemSize=" + itemSize + ", updateTime=" + updateTime + "]";
	}


}
