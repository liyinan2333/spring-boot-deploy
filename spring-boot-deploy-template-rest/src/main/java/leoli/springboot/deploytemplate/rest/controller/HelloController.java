package leoli.springboot.deploytemplate.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static leoli.springboot.deploytemplate.rest.SpringBootDeployTemplateRestComponent.COMPONENT_NAME;

/**
 * Demo Controlelr
 *
 * @author leoli
 * @date 2020/12/08
 */
@RestController
@RequestMapping(COMPONENT_NAME + "/hello")
public class HelloController {

    @RequestMapping("say")
    public ResponseEntity<?> say() {
        return ResponseEntity.ok("Hello Spring Boot!");
    }

}
