package demo.plan.pojo;

import java.util.Date;

public class PlanItem {

    private long itemId;
    private String itemName;
    private boolean itemState;
    private int itemPoint;
    private Date itemCreateTime;
    private boolean itemCreateFlag;

    public PlanItem() {}

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

    public boolean isItemCreateFlag() {
        return itemCreateFlag;
    }

    public PlanItem setItemId(long itemId) {
        this.itemId = itemId;
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

    public PlanItem setItemCreateFlag(boolean itemCreateFlag) {
        this.itemCreateFlag = itemCreateFlag;
        return this;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "planItem{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemState=" + itemState +
                ", itemPoint=" + itemPoint +
                ", itemCreateTime=" + itemCreateTime +
                ", itemCreateFlag=" + itemCreateFlag +
                '}';
    }
}
