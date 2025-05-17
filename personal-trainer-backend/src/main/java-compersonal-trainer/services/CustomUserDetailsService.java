package com.personaltrainer.services;

import com.personaltrainer.models.User;
import com.personaltrainer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
  @Autowired private UserRepository userRepo;

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    User u = userRepo.findByEmail(email)
              .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));
    return org.springframework.security.core.userdetails.User
            .withUsername(u.getEmail())
            .password(u.getSenha())
            .authorities("ROLE_" + u.getTipo().name())
            .build();
  }
}
