package demo.plan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import demo.plan.pojo.DailyPlanBean;
import demo.plan.pojo.Demo;
import demo.plan.pojo.PlanItem;
import demo.plan.service.DemoService;
import demo.plan.util.DateUtil;
import demo.plan.util.JSONUtil;

@RestController
public class DemoController {
	@Autowired
    private DemoService demoService;
   
    @RequestMapping("/likeName")
    public List<Demo> likeName(String name) throws Exception{
       return demoService.likeName(name);
    }
    
    @RequestMapping("/getDemo")
    public List<Demo> getDemo(long id) throws Exception{
       return demoService.getDemo(id);
    }
    
    @RequestMapping("/newDemo")
    public boolean newDemo() throws Exception{
    	Demo demo = new Demo();
    	demo.setId(2);
    	demo.setUsername("test");
       return demoService.newDemo(demo);
    }
    
    @RequestMapping("/savePlan")
    public @ResponseBody String savePlan(@RequestBody String reqData){
    	JSONObject req = null;
    	JSONObject resp = null;
    	try {
    		req = JSONUtil.getReqJSON(reqData);
    		resp = JSONUtil.getRespJSON();
    		
    		String planName = req.getString("planName");
    		int itemSize = req.getIntValue("itemSize");
    		int point = 0;
    		JSONArray itemNameArr = req.getJSONArray("itemNameArr");
    		JSONArray itemPointArr = req.getJSONArray("itemPointArr");
    		
    		if(itemNameArr.size() != itemSize || itemPointArr.size() != itemNameArr.size()) {
    			throw new Exception("任务数量异常");
    		}
    		
    		List<PlanItem> planItems = new ArrayList<PlanItem>();
    		PlanItem pi = null;
    		for(int i = 0; i < itemSize; i++) {
    			pi = new PlanItem();
    			pi.setItemCreateTime(DateUtil.getNow())
    			.setItemName(itemNameArr.getString(i))
    			.setItemPoint(itemPointArr.getIntValue(i))
    			.setItemState(true);
    			
    			point += itemPointArr.getIntValue(i);
    			
    			planItems.add(pi);
    		}
    		
    		DailyPlanBean dp = new DailyPlanBean();
    		dp.setCreateTime(DateUtil.getNow())
    		.setStartTime(DateUtil.getPlanTime(DateUtil.StartTime, DateUtil.Time24))
    		.setEndTime(DateUtil.getPlanTime(DateUtil.EndTime, DateUtil.Time24))
    		.setPlanName(planName)
    		.setState(true)
    		.setPoint(point)
    		.setPlanItems(planItems);
    		
    		// Service.insertDailyPlan(dp)
    		boolean res = demoService.savePlan(dp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSONUtil.returnJSON(resp);
    }
    
}
