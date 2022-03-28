package com.covenant.tistory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("이메일 마스킹 테스트")
class EmailMaskingBasicParamTest {

    private static Stream<Arguments> emailMaskingParam() {
        return Stream.of(
                arguments("apple@apple.com", "app**@apple.com")
        );
    }

    @ParameterizedTest(name = "이메일주소 {0}은 {1}로 변환")
//    @ParameterizedTest(name = "{arguments}")
    @MethodSource("emailMaskingParam")
    void email_param_masking_test(String email, String expectMaskingEmail) {
        String maskingEmail = MaskingUtils.emailMasking(email);

        Assertions.assertEquals(expectMaskingEmail, maskingEmail);
    }
}
