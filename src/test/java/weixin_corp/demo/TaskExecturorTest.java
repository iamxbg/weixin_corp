package weixin_corp.demo;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.core.util.ExecutorServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.concurrent.ListenableFuture;

import weixin_corp.config.RootConfig;

@ContextConfiguration(classes= {RootConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class TaskExecturorTest {

	
	@Test
	public void testThreadPoolTaskExecutor() throws InterruptedException {
		
	
	//Executors.newFixedThreadPool(nThreads)
		
		ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();
			taskExecutor.setCorePoolSize(100);
			taskExecutor.setMaxPoolSize(120);
			taskExecutor.setQueueCapacity(20);
			taskExecutor.setDaemon(true);

			taskExecutor.initialize();
			
			for(int i=0;i<200;i++) {
				final int k=i;
				Thread.sleep(100);
				ListenableFuture<Date> result=taskExecutor.submitListenable(new Callable<Date>() {

					@Override
					public Date call() throws Exception {
						// TODO Auto-generated method stub
						//Thread.currentThread().wait(1000);
						long x=0l;
						
						for(long i=0;i<5000000000l;i++) {
							x+=i;
						}
						System.out.println("active-thread:"+taskExecutor.getActiveCount());
						
						System.out.println(k+":X:"+x);
						return new Date();
					}
				});

			}
			
			TaskScheduler
			/*
			try {
				
				System.out.println("currentDate:"+result.get().getMinutes()+":"+result.get().getSeconds());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			

		
	}
}
