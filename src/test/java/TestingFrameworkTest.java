import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestingFrameworkTest {

    @Test
    void should_pass_the_test() {
        assertThat(true)
                .isTrue();
    }
}
