package af.asr.keycloak.resource;

import af.asr.keycloak.infrastructure.util.JWTUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {


    @RequestMapping("/token")
    public String getToken(){
        return JWTUtil.getJWTToken();
    }

}