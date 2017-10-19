package demo.plan.pojo;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * ����������
 * 
 * @author Administrator
 *
 */
public class planBaseBean {
	private long planId; // ����ID��ÿ������Ψһ
	private String planName; // �������ƣ����ڼ򵥵ı�ʾ����
	private Date createTime; // ���񴴽�ʱ��

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
				+ "����ID:" + String.valueOf(planId)
				+ ",������:" + planName
				+ ",����ʱ��:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createTime);
	}
	
}
