package fag.visma.bysykkel.vue.fullstack.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubernetesController {

    @GetMapping("actuator/isAlive")
    void isAlive() {

    }

    @GetMapping("actuator/isReady")
    void isReady() {

    }
}
