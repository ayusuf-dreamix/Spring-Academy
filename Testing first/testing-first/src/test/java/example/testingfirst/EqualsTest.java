package example.testingfirst;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualsTest {

    @Test
    public void shouldEqualToTwoTest() {
        assertThat(2).isEqualTo(2);
    }
}
