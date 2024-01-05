package com.springboot.security.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.function.Function;

@Component
@Slf4j
public class JwtUtils { // 0.11.5 VERSION jwt

    @Value("${jwt.secret.key}")
    private String secretKey;   // ayudara a firmar nuestro metodo, lo que brindara autorizacion si es valido

    @Value("${jwt.time.expiration}")
    private String timeExpiration;  // tiempo de expiration de duracion del token

//    GENERAR TOKEN DE ACCESO
    public String generateAccessToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + Long.parseLong(timeExpiration)))
                .signWith(getSignaturaKey(), SignatureAlgorithm.HS256)
                .compact();
    }

//    VALIDAR TOKEN DE ACCESO
    public boolean isTokenValid(String token) {
        // si esto vota alguna excepcion, el token es invalido
        try {
            // decodifica el token
            Jwts.parserBuilder()
                    .setSigningKey(getSignaturaKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            return true;
        }catch (Exception e) {
            log.error("Token invalido, error: ".concat(e.getMessage()));
            return false;
        }
    }

//    OBTENER USERNAME DEL TOKEN
    public String getUsernameFromToken(String token) {
        return getClaim(token, Claims::getSubject);
    }

//    OBTENER SOLO UN CLAIM
    public <T> T getClaim(String token, Function<Claims, T> claimsTFunction) {
        Claims claims = extractAllClaims(token);
        return claimsTFunction.apply(claims);
    }

//    OBTENER CLAIMS DEL TOKEN
    public Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(getSignaturaKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

//    OBTENER FIRMA DEL TOKEN
    public Key getSignaturaKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
