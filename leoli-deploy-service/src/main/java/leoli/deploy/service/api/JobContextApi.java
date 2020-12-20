package leoli.deploy.service.api;

/**
 * 动态定时任务统一管理接口
 *
 * @author leoli
 * @date 2020/12/20
 */
public interface JobContextApi {

    String getCron(String id);

}
