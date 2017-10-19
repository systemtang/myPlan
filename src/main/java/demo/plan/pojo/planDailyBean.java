package demo.plan.pojo;

import java.util.Date;
import java.util.List;

public final class planDailyBean extends planBaseBean {

	private Date startTime;
	private Date endTime;
	private int point;
	private boolean state;
	private List<planItem> planItems;
	
	public planDailyBean(long planId, String planName, Date createTime) {
		super(planId, planName, createTime);
	}

}
