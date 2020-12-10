package leoli.deploy.web.controller.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static leoli.deploy.web.DeployRestComponent.COMPONENT_NAME;

/**
 * Demo Controlelr
 *
 * @author leoli
 * @date 2020/12/08
 */
@RestController
@RequestMapping(COMPONENT_NAME + "/hello")
public class HelloRest {

    @RequestMapping("say")
    public ResponseEntity<?> say() {
        return ResponseEntity.ok().body("Hello Spring Boot!");
    }

}
