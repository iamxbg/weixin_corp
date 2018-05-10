package weixin_corp.config;

import java.util.ResourceBundle;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages= {"weixin_company_message_broker"},excludeFilters= {@Filter(type=FilterType.ANNOTATION,value=Configuration.class)})
@ImportResource(locations="classpath:applicationContext.xml")
public class RootConfig {

	
	
	@Bean
	public DataSource dataSource() {

		String username="root";
		String password="test123";
		String url="jdbc:mysql://localhost:3306/weixin_corp";
		
		BasicDataSource dataSource=new BasicDataSource();
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			dataSource.setUrl(url);
			
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
			sf.setDataSource(dataSource());
			sf.setConfigLocation(new ClassPathResource("hibernate.cfg.xml"));
			sf.setPackagesToScan("weixin_corp.entity");
			return sf;
	}
	
}
