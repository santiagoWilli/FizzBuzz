import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {
    @Test
    public void one_should_return_1() {
        assertThat(of(1)).isEqualTo("1");
    }

    @Test
    public void two_should_return_2() {
        assertThat(of(2)).isEqualTo("2");
    }

    private String of(int i) {
        return (i == 1 ? "1" : "2");
    }
}
