package leoli.springboot.deploytemplate.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SpringBootDeployTemplateRestComponent {

    public static final String COMPONENT_NAME = "springboot-deploytemplate-rest";
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootDeployTemplateRestComponent.class);

    @PostConstruct
    void init() {
        LOGGER.info("==>组件初始化成功==>[{}]", COMPONENT_NAME);
    }

}
