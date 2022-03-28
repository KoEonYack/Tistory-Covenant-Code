package com.covenant.tistory;

import org.apache.commons.lang3.StringUtils;

public class MaskingUtils {

    /**
     * 이메일 마스킹 처리
     *
     * @param email
     * @return
     */
    public static String emailMasking(String email){
        int maxVisibleLength = 2;
        email = StringUtils.trim(email);
        String localPart = StringUtils.split(email, "@")[0];
        String emailDomain = StringUtils.split(email, "@")[1];
        return localPart.substring(0, localPart.length() - maxVisibleLength) + "**@" + emailDomain;
    }
}
