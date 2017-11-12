package demo.plan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import demo.plan.pojo.Demo;
@Mapper
public interface DemoMapper {

//	@Select("select * from demo where name = #{name}")
//    public List<Demo> likeName(String UserName);
//   
//    @Select("select * from demo where id = #{id}")
//    public Demo getById(long id);
//   
//    @Select("select name from demo where id = #{id}")
//    public String getNameById(long id);

	public List<Demo> getDemo(long id);

}
