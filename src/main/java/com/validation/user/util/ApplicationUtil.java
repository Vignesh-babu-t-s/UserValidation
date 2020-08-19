package com.validation.user.util;

import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.thymeleaf.util.StringUtils;

public class ApplicationUtil {

	public static String extractUserId(JwtDecoder jwtDecoder,String header) {
		
		String accessToken=header.replaceAll("Bearer ", "");
		Jwt jwt=jwtDecoder.decode(accessToken);
		return StringUtils.replace(jwt.getClaimAsString("sub"), "auth0|", "");
	}
}
