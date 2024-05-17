package com.study.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Instant;
import java.util.Map;

@Controller
@RequestMapping("/api/main44")
@RequiredArgsConstructor
public class Controller44 {

    private final JwtEncoder jwtEncoder;

    @PostMapping("login")
    @ResponseBody
    public String login(@RequestBody Map<String, Object> map) {
        // 사용자 이름
        String username = map.get("username").toString();
        // 권한
//        map.get("scope");

        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuer("self")
                .issuedAt(Instant.now())
                .expiresAt(Instant.now().plusSeconds(60 * 60 * 24))
                .subject(username)
//                .claim("scope", "") // 권한
                .build();
        return jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }

}
