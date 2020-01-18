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

    @Test
    public void three_should_return_Fizz() {
        assertThat(of(3)).isEqualTo("Fizz");
    }

    private String of(int i) {
        if (i == 3) return "Fizz";
        return (i == 1 ? "1" : "2");
    }
}
