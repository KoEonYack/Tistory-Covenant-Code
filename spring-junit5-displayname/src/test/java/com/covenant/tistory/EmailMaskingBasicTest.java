package com.covenant.tistory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("이메일 마스킹 테스트")
class EmailMaskingBasicTest {

    @Test
    @DisplayName("로컬 파트 5자리 마스킹 테스트")
    void localpart_5_length_masking() {
        String email = "apple@apple.com";

        String maskingEmail = MaskingUtils.emailMasking(email);

        Assertions.assertEquals("app**@apple.com", maskingEmail);
    }

    @Test
    @DisplayName("공백이 있는 로컬 파트 5자리 마스킹 테스트")
    void localpart_5_length_startwith_whitespace_masking() {
        String email = " apple@apple.com";

        String maskingEmail = MaskingUtils.emailMasking(email);

        Assertions.assertEquals("app**@apple.com", maskingEmail);
    }
}
