package leoli.deploy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = {"leoli.deploy"})
public class DeployApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeployApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DeployApplication.class, args);
    }
}
