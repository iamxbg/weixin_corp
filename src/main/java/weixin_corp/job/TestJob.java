package weixin_corp.job;

import java.util.Date;

public class TestJob implements IJob<Void>{

	@Override
	public Void call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(new Date().getTime());
		return null;
	}

}
