package weixin_corp.job;

import java.util.concurrent.Callable;

public interface IJob<V> extends Callable<V> {

}
