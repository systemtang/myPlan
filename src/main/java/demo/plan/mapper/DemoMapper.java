package demo.plan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import demo.plan.pojo.DailyPlanBean;
import demo.plan.pojo.Demo;

public interface DemoMapper {

	@Select("select * from Policy where UserName = #{UserName}")
    public List<Demo> likeName(String UserName);
   
    @Select("select * from Policy where UserID = #{UserID}")
    public Demo getById(long id);
   
    @Select("select UserName from Policy where UserID = #{UserID}")
    public String getNameById(long id);

	public boolean savePlan(DailyPlanBean dp) throws Exception;
}
