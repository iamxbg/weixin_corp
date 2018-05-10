package weixin_corp.demo;

import org.junit.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

public class TaskSchedulerTest {

	
	
	
	
	public void setScheduler() {
		
	}
	
	//@Test
	//pubilc void testPrintlnWithFixedInterval() {
	public static void main(String... args) {
		//scheduler.setThreadFactory(new ThreadPoolTaskExecutor());
		ThreadPoolTaskScheduler scheduler=new ThreadPoolTaskScheduler();
		//scheduler.setDaemon(true);
		scheduler.initialize();

		scheduler.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello Dude");
				
			}
		}, 1000);
		
		
		
		
	}
	
}
