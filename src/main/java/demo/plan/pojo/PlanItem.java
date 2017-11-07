package demo.plan.pojo;

import java.util.Date;

public class PlanItem {

	private long itemId;
	private long planId;
	private String itemName;
	private boolean itemState;
	private int itemPoint;
	private Date itemCreateTime;

	public PlanItem() {}

	public long getPlanId() {
		return planId;
	}

	public long getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public boolean isItemState() {
		return itemState;
	}

	public int getItemPoint() {
		return itemPoint;
	}

	public Date getItemCreateTime() {
		return itemCreateTime;
	}

	public PlanItem setItemId(long itemId) {
		this.itemId = itemId;
		return this;
	}

	public PlanItem setPlanId(long planId) {
		this.planId = planId;
		return this;
	}

	public PlanItem setItemName(String itemName) {
		this.itemName = itemName;
		return this;
	}

	public PlanItem setItemState(boolean itemState) {
		this.itemState = itemState;
		return this;
	}

	public PlanItem setItemPoint(int itemPoint) {
		this.itemPoint = itemPoint;
		return this;
	}

	public PlanItem setItemCreateTime(Date itemCreateTime) {
		this.itemCreateTime = itemCreateTime;
		return this;
	}

	@Override
	public String toString() {
		return "PlanItem [itemId=" + itemId + ", planId=" + planId + ", itemName=" + itemName + ", itemState="
				+ itemState + ", itemPoint=" + itemPoint + ", itemCreateTime=" + itemCreateTime + "]";
	}
}
