package covenant.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Junit5ExceptionText {

    @Test
    public void junit5에서_exception_테스트_1() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            DoSomething.func();
        });
    }

    @Test
    public void junit5에서_exception_테스트_1_2() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            DoSomething.func2();
        });
    }

    @Test
    public void junit5에서_exception_테스트_2() {
        assertThatThrownBy(() -> DoSomething.func()).isInstanceOf(RuntimeException.class);
    }

    @Test
    public void junit5에서_exception_테스트_3() {
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            DoSomething.func();
        });
        Assertions.assertEquals("some exception message...", exception.getMessage());
    }

    @Test
    public void junit5에서_exception_테스트_4() {
        try {
            DoSomething.func();
            Assertions.fail("some exception message...");
        } catch (RuntimeException e) {
            Assertions.assertEquals("some exception message...", e.getMessage());
        }
    }
}
