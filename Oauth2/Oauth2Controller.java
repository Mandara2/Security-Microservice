package com.rml.security.Oauth2;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Oauth2Controller {
    @GetMapping("/")
    @ResponseBody
    public Map<String, Object> getUserInfo(@AuthenticationPrincipal OAuth2User oauth2User) {

        return oauth2User.getAttributes();
    }
}
