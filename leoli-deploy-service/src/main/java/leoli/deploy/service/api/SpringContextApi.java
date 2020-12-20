package leoli.deploy.service.api;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Spring的ApplicationContext相关接口
 *
 * @author leoli
 * @date 2020/12/11
 */
@Component
public class SpringContextApi implements ApplicationContextAware {

    private static ApplicationContext context;

    public static SpringContextApi get() {
        return context.getBean(SpringContextApi.class);
    }

    public static ApplicationContext getContext() {
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
