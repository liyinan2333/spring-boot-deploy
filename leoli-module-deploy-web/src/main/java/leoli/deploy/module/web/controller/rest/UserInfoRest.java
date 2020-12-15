package leoli.deploy.module.web.controller.rest;

import leoli.deploy.module.web.DeployWebComponent;
import leoli.deploy.service.data.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo Controlelr
 *
 * @author leoli
 * @date 2020/12/08
 */
@RestController
@RequestMapping(DeployWebComponent.COMPONENT_NAME + "/user")
public class UserInfoRest {

    @Autowired
    UserInfoRepository repository;

    @RequestMapping("{userCode}")
    public ResponseEntity<?> getById(@PathVariable String userCode) {
        return ResponseEntity.ok().body(repository.findById(1L));
    }

}
