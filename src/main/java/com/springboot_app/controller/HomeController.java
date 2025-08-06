package com.springboot_app.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String publicPage() {
        return "Public page: anyone can see this.";
    }

    @GetMapping("/secured")
    public String securedPage(@AuthenticationPrincipal OidcUser user) {
        return "Secured page. Welcome, " + user.getFullName();
    }
}
