package weixin_corp.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

public class JobManager {
	
	@Autowired
	private ThreadPoolTaskExecutor jobLabors;
	
	@Autowired
	private ThreadPoolTaskScheduler jobScheduler;
	
	
	
	
}
