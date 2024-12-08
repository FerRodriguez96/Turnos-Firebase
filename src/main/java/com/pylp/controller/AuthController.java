package com.pylp.controller;

import com.pylp.service.FirebaseAuthService;
import com.google.firebase.auth.FirebaseToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private FirebaseAuthService firebaseAuthService;

    @PostMapping("/verify")
    public Map<String, Object> verifyToken(@RequestHeader("Authorization") String idToken) {
        FirebaseToken decodedToken = firebaseAuthService.verifyToken(idToken);
        Map<String, Object> response = new HashMap<>();
        response.put("uid", decodedToken.getUid());
        response.put("email", decodedToken.getEmail());
        return response;
    }
}
