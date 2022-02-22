package com.devd.spring.bookstorecommons.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import java.util.Map;


public class CommonUtilityMethods {

    public static String getUserIdFromToken(Authentication authentication) {
        Map<String, String> map = (Map)((OAuth2Authentication) authentication).getUserAuthentication().getDetails();
        return map.get("user_id");
    }

    public static String getUserNameFromToken(Authentication authentication) {
        Map<String, String> map = (Map)((OAuth2Authentication) authentication).getUserAuthentication().getDetails();
        return map.get("user_name");
    }
}
