package com.covenant.tistory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Named.named;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("이메일 마스킹 테스트")
class EmailMaskingParamTest {

    private static Stream<Arguments> emailMaskingParam() {
        return Stream.of(
                arguments(named("로컬 파트의 길이 5는", "apple@apple.com")
                        , named("로컬파트 끝 두자리 마스킹", "app**@apple.com")),
                arguments(named("공백으로 시작하는 로컬 파트의 길이 5는", " apple@apple.com")
                        , named("로컬파트 끝 두자리 마스킹", "app**@apple.com"))
        );
    }

    @ParameterizedTest(name = "{0} {1}")
    @MethodSource("emailMaskingParam")
    @DisplayName("이메일 마스킹 테스트")
    void email_param_masking_test(String email, String expectMaskingEmail) {
        String maskingEmail = MaskingUtils.emailMasking(email);

        Assertions.assertEquals(expectMaskingEmail, maskingEmail);
    }
}
