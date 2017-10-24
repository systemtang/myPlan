package demo.plan.pojo;

import java.util.Date;

public class planItem {

    private long itemId;
    private String itemName;
    private boolean itemState;
    private int itemPoint;
    private Date itemCreateTime;
    private boolean itemCreateFlag;

    public planItem(long itemId, String itemName, boolean itemState, int itemPoint, Date itemCreateTime, boolean itemCreateFlag) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemState = itemState;
        this.itemPoint = itemPoint;
        this.itemCreateTime = itemCreateTime;
        this.itemCreateFlag = itemCreateFlag;
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

    public boolean isItemCreateFlag() {
        return itemCreateFlag;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemState(boolean itemState) {
        this.itemState = itemState;
    }

    public void setItemPoint(int itemPoint) {
        this.itemPoint = itemPoint;
    }

    public void setItemCreateTime(Date itemCreateTime) {
        this.itemCreateTime = itemCreateTime;
    }

    public void setItemCreateFlag(boolean itemCreateFlag) {
        this.itemCreateFlag = itemCreateFlag;
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
