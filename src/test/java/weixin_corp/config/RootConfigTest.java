package weixin_corp.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes= {RootConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class RootConfigTest {

	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	private SessionFactory sf;
	
	@Test
	public void testDataSourceNotNull() {
		Assert.assertNotNull(dataSource);
		
		try(Connection conn=dataSource.getConnection()){
			Assert.assertNotNull(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testSessionFactoryNotNull() {
		Assert.assertNotNull(sf);
	}
	
	
	@Test 
	public void testScheduler() {
		//TaskExecutor
		ExecutorService
	}

	
}
