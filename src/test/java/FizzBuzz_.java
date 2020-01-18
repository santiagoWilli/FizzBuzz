import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {
    @Test
    public void a_number_not_divisible_by_3_or_5_should_return_its_value_as_a_string() {
        assertThat(of(1)).isEqualTo("1");
        assertThat(of(2)).isEqualTo("2");
        assertThat(of(4)).isEqualTo("4");
    }

    @Test
    public void three_should_return_Fizz() {
        assertThat(of(3)).isEqualTo("Fizz");
    }

    @Test
    public void five_should_return_Buzz() {
        assertThat(of(5)).isEqualTo("Buzz");
    }

    private String of(int i) {
        if (i != 3 && i != 5) return String.valueOf(i);
        return (i == 3 ? "Fizz" : "Buzz");
    }
}
