package com.covenant.tistory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

@DisplayNameGeneration(EmailMaskingDisplayNameCustomGeneratorTest.CustomDisplayNameGenerator.class)
class EmailMaskingDisplayNameCustomGeneratorTest {

    @Test
    void localpart_5_length_masking() {
        String email = "apple@apple.com";

        String maskingEmail = MaskingUtils.emailMasking(email);

        Assertions.assertEquals("app**@apple.com", maskingEmail);
    }

    @Test
    void localpart_5_length_startwith_whitespace_masking() {
        String email = " apple@apple.com";

        String maskingEmail = MaskingUtils.emailMasking(email);

        Assertions.assertEquals("app**@apple.com", maskingEmail);
    }

    static class CustomDisplayNameGenerator extends DisplayNameGenerator.Standard {

        @Override
        public String generateDisplayNameForClass(Class<?> testClass) {
            return "이메일 마스킹 테스트";
        }

        @Override
        public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
            return super.generateDisplayNameForNestedClass(nestedClass);
        }

        @Override
        public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
            String name = testMethod.getName();
            return Arrays.stream(name.split("_")).collect(Collectors.joining(" "));
        }
    }
}
