package leoli.deploy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * deploy各组件的公共接口组件
 *
 * @author leoli
 * @date 2020/12/11
 */
@Component
public class DeployServiceComponent {

    public static final String COMPONENT_NAME = "deploy-service";
    private static final Logger LOGGER = LoggerFactory.getLogger(DeployServiceComponent.class);

    @PostConstruct
    void init() {
        LOGGER.info("==>组件初始化成功==>[{}]", COMPONENT_NAME);
    }



}
