package com.personaltrainer.services;
import com.personaltrainer.models.User;
import com.personaltrainer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
  @Autowired private UserRepository userRepo;
  @Autowired private BCryptPasswordEncoder encoder;
  @Autowired private JwtUtil jwtUtil;

  public User register(User user) {
    user.setSenha(encoder.encode(user.getSenha()));
    return userRepo.save(user);
  }

  public String login(String email, String senha) {
    var user = userRepo.findByEmail(email)
              .orElseThrow(() -> new RuntimeException("Usuário não existe"));
    if (!encoder.matches(senha, user.getSenha()))
      throw new RuntimeException("Senha inválida");
    return jwtUtil.generateToken(user.getEmail());
  }
}
