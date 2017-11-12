package demo.plan.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import demo.plan.pojo.DailyPlanBean;
import demo.plan.pojo.Demo;

public interface DemoMapper {

	public List<Demo> getDemo(long id) throws Exception;
	
	public boolean savePlan(DailyPlanBean dp) throws Exception;

	public int newDemo(Demo demo) throws Exception;
	
}
