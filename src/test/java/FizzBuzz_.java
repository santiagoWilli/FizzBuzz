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

    @Test
    public void four_should_return_4() {
        assertThat(of(4)).isEqualTo("4");
    }

    private String of(int i) {
        if (i != 3) return String.valueOf(i);
        return "Fizz";
    }
}
