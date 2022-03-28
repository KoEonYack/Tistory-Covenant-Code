package com.covenant.tistory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayName("이메일 마스킹")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class EmailMaskingDisplayNameSimpleGeneratorTest {

    @Test
    void 로컬_파트_5자리_마스킹_테스트() {
        String email = "apple@apple.com";

        String maskingEmail = MaskingUtils.emailMasking(email);

        Assertions.assertEquals("app**@apple.com", maskingEmail);
    }

    @Test
    void 공백을_포함한_로컬_파트_5자리_마스킹_테스트() {
        String email = " apple@apple.com";

        String maskingEmail = MaskingUtils.emailMasking(email);

        Assertions.assertEquals("app**@apple.com", maskingEmail);
    }
}
