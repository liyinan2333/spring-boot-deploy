package leoli.deploy.module.web.controller.rest;

import leoli.deploy.module.web.DeployWebComponent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo Controlelr
 *
 * @author leoli
 * @date 2020/12/08
 */
@RestController
@RequestMapping(DeployWebComponent.COMPONENT_NAME + "/hello")
public class HelloRest {

    @RequestMapping("say")
    public ResponseEntity<?> say() {
        return ResponseEntity.ok().body("Hello Spring Boot!");
    }

}
