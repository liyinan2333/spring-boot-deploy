package leoli.deploy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"leoli.springboot.deploytemplate"})
public class DeployApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeployApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(DeployApplication.class, args);

    }
}
