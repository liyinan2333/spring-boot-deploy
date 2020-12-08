package leoli.springboot.deploytemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootDeployTemplateApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootDeployTemplateApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringBootDeployTemplateApplication.class, args);

    }
}
