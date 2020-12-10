package leoli.deploy.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DeployRestComponent {

    public static final String COMPONENT_NAME = "deploy-web";
    private static final Logger LOGGER = LoggerFactory.getLogger(DeployRestComponent.class);

    @PostConstruct
    void init() {
        LOGGER.info("==>组件初始化成功==>[{}]", COMPONENT_NAME);
    }

}
