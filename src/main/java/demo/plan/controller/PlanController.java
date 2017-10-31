package demo.plan.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by Administrator on 2017/10/19.
 */
@Controller
public class PlanController {

	@RequestMapping("/hello")
    public String helloHtml(Map<String,Object> map){
       map.put("hello","from TemplateController.helloHtml");
       map.put("myself","yes1");
       return"/hello";
    }
	
	@RequestMapping("/index")
    public String index(Map<String,Object> map){
       map.put("myword","THE WORLD!");
       return"/index";
    }
	
	@RequestMapping("/index2")
    public String index(Model map){
		JSONObject plan = new JSONObject();
		List<JSONObject> plans = new ArrayList<JSONObject>();
		plan.put("name", "trj's plan");
		plan.put("date", new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()));
		plan.put("point", "50");
		plan.put("state", "1");
//		plans.add(plan);
//		plans.add(plan);
		map.addAttribute("myword","THE WORLD TOKIOTOMALEI!");
		map.addAttribute("plan", plan);
		map.addAttribute("plans", plans);
       return"/index";
    }
	
}
