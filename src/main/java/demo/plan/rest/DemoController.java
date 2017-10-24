package demo.plan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.plan.pojo.Demo;
import demo.plan.service.DemoService;

@RestController
public class DemoController {
	@Autowired
    private DemoService demoService;
   
    @RequestMapping("/likeName")
    public List<Demo> likeName(String name){
       return demoService.likeName(name);
    }
}
