package com.personaltrainer.security;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class JwtUtil {
  @Value("${jwt.secret}")    private String secret;
  @Value("${jwt.expiration}")private long expiration;

  public String generateToken(String subject) {
    Date now = new Date();
    Date exp = new Date(now.getTime() + expiration);
    return Jwts.builder()
            .setSubject(subject)
            .setIssuedAt(now)
            .setExpiration(exp)
            .signWith(SignatureAlgorithm.HS512, secret)
            .compact();
  }

  public String getUsername(String token) {
    return Jwts.parser().setSigningKey(secret)
               .parseClaimsJws(token).getBody().getSubject();
  }

  public boolean validate(String token) {
    try {
      Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
