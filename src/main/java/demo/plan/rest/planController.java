package demo.plan.rest;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/10/19.
 */
@Controller
public class planController {

	@RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
       map.put("hello","from TemplateController.helloHtml");
       return"/hello";
    }
	
	@RequestMapping("/index")
    public String index(Map<String,Object> map){
       map.put("myword","THE WORLD!");
       return"/index";
    }
}
