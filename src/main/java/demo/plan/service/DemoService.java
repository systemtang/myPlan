package demo.plan.service;

import java.util.List;

import demo.plan.pojo.DailyPlanBean;
import demo.plan.pojo.Demo;

public interface DemoService {

	public List<Demo> likeName(String name) throws Exception;

	public boolean savePlan(DailyPlanBean dp) throws Exception;
}
