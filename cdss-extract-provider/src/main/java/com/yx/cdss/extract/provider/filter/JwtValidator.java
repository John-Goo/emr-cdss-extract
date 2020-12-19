package com.yx.cdss.extract.provider.filter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class JwtValidator {

    public static String _JWT_KEY;

    public JwtUser validate(String token) {
        JwtUser jwtUser = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(_JWT_KEY)
                    .parseClaimsJws(token)
                    .getBody();
            jwtUser = new JwtUser();
            jwtUser.setUserName(body.getSubject());
            jwtUser.setUserId((String)body.get("userId"));
            jwtUser.setRoles((String) body.get("role"));
            jwtUser.setClientId((String) body.get("clientId"));
        }catch (Exception e) {
            System.out.println(e);
        }
        return jwtUser;
    }
}
