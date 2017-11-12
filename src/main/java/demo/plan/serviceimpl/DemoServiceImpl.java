package demo.plan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.plan.dao.DemoMapper;
import demo.plan.pojo.DailyPlanBean;
import demo.plan.pojo.Demo;
import demo.plan.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
	@Autowired
    private DemoMapper demoMapper;

	@Override
    public List<Demo> likeName(String name){
        return null;//demoMapper.likeName(name);
    }
	
	@Override
	public List<Demo> getDemo(long id) throws Exception {
		return demoMapper.getDemo(id);
	}
	
	@Override
	public boolean newDemo(Demo demo) throws Exception {
		int i = demoMapper.newDemo(demo);
		System.out.println(i);
		return i>0?true:false;
	}

	@Override
	public boolean savePlan(DailyPlanBean dp) throws Exception {
		return demoMapper.savePlan(dp);
	}

}
