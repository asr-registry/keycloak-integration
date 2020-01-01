package af.asr.keycloak.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {


    @RequestMapping("/token")
    public String getToken(){
        return "test-token";
    }

}