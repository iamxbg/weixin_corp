package weixin_corp.util;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import weixin_corp.config.RootConfig;
import weixin_corp.entity.AccessToken;

@ContextConfiguration(classes= {RootConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AccessTokenManagerTest {

	@Resource(name="localAccessTokenManager")
	private AccessTokenManager tokenManager;
	
	@Test
	public void testGetAccessToken() {

		
		AccessToken token=tokenManager.getAccessToken(0);
		
		assert token != null;
		
		System.out.println("access_token:"+token.getAccessToken());
	}
}
