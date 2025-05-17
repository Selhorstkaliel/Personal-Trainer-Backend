package com.personaltrainer.controllers;

import com.personaltrainer.models.User;
import com.personaltrainer.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
  @Autowired private AuthService authService;

  @PostMapping("/cadastro")
  public ResponseEntity<User> register(@RequestBody User u) {
    User saved = authService.register(u);
    saved.setSenha(null);
    return ResponseEntity.ok(saved);
  }

  @PostMapping("/login")
  public ResponseEntity<String> login(@RequestBody User u) {
    String token = authService.login(u.getEmail(), u.getSenha());
    return ResponseEntity.ok(token);
  }
}
