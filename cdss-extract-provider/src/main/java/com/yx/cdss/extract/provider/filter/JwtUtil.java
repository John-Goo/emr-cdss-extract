package com.yx.cdss.extract.provider.filter;

import com.yx.cdss.extract.provider.util.MD5Util;
import com.yx.cdss.extract.provider.util.PropUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

public class JwtUtil {

    private static String _JWT_KEY;
    private static final String _JWT_PRIFIX = "wtoken-";
    private static final String _SEC_KEY_TEMPLATE = "W${TK}LJIAM";

    public static void setProfileEnv(String profileEnv){
        String jwtKey= PropUtil.get(profileEnv+".jwt.token.key");
        String tmp = jwtKey.substring(1,27);
        jwtKey = MD5Util.md5Hex(jwtKey).toUpperCase();
        jwtKey = _SEC_KEY_TEMPLATE.replace("${TK}",tmp);
        _JWT_KEY = jwtKey;
    }

    public static JwtUser validate(String token) {
        if(StringUtils.isEmpty(_JWT_KEY)){
            throw new RuntimeException("=====>未设置jwt Signingkey[签名Key]");
        }
        JwtUser jwtUser = null;
        System.out.println(">>>> 令牌key:"+_JWT_KEY);
        try {
            // 去掉前辍
            token = token.replace(_JWT_PRIFIX,"");
            Claims body = Jwts.parser()
                    .setSigningKey(_JWT_KEY)
                    .parseClaimsJws(token)
                    .getBody();
            jwtUser = new JwtUser();
            jwtUser.setUserName(body.getSubject());
            jwtUser.setUserId((String) body.get("userId"));
            jwtUser.setRoles((String) body.get("role"));
            // 头部（公共）
            jwtUser.setClientId((String) body.get("clientId"));
            // 头部（公共）
            jwtUser.setToken((String) body.get("token"));
            // 头部（公共）
            jwtUser.setPlatformType((Integer) body.get("platformType"));
            jwtUser.setCreateTime((Long) body.get("createTime"));
        }catch (Exception e) {
            System.out.println(e);
        }
        return jwtUser;
    }

    public static String generate(JwtUser jwtUser) {
        if(StringUtils.isEmpty(_JWT_KEY)){
            throw new RuntimeException("=====>未设置jwt Signingkey[签名Key]");
        }
        System.out.println(">>>> 令牌key:"+_JWT_KEY);
        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUserName());
        claims.put("userId", jwtUser.getUserId());
        claims.put("role", jwtUser.getRoles());
        claims.put("clientId",jwtUser.getClientId());
        claims.put("platformType",jwtUser.getPlatformType());
        claims.put("createTime",new Date().getTime());
        String tokenStr = Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, _JWT_KEY)
                .compact();
        tokenStr = _JWT_PRIFIX + tokenStr;
        return tokenStr;
    }
}
