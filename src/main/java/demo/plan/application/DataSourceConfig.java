package demo.plan.application;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	@Bean //2
    public DataSource dataSource(){ //3
        DataSource dataSource = new DataSource(); 
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://47.96.8.46:3306/system_plan?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        dataSource.setUsername("trj");
        dataSource.setPassword("023120@tx1");
        return dataSource;
    }
}
