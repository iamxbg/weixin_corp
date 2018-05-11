package weixin_corp.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import weixin_corp.config.RootConfig;
import weixin_corp.util.AccessTokenManager;

@ContextConfiguration(classes= {RootConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PhoneBookTest {

	
	@Resource(name="localResourceAccessTokenManager")
	AccessTokenManager tokenManager;
	
	
	@Test
	public void testGetDepartmentList() {
		
		String url="https://qyapi.weixin.qq.com/cgi-bin/department/list?access_token=ACCESS_TOKEN";
		
		
	}
	
}
