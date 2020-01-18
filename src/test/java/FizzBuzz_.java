import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void a_number_not_divisible_by_3_or_5_should_return_its_value_as_a_string() {
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
        assertThat(fizzBuzz.of(4)).isEqualTo("4");
    }

    @Test
    public void a_number_divisible_by_3_should_return_Fizz() {
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(6)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(9)).isEqualTo("Fizz");
    }

    @Test
    public void a_number_divisible_by_5_should_return_Buzz() {
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(10)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(20)).isEqualTo("Buzz");
    }

    @Test
    public void fifteen_should_return_FizzBuzz() {
        assertThat(fizzBuzz.of(15)).isEqualTo("Fizz Buzz");
    }
}
