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
    public void a_number_divisible_by_3_should_return_Fizz() {
        assertThat(of(3)).isEqualTo("Fizz");
        assertThat(of(6)).isEqualTo("Fizz");
        assertThat(of(9)).isEqualTo("Fizz");
    }

    @Test
    public void five_should_return_Buzz() {
        assertThat(of(5)).isEqualTo("Buzz");
    }

    @Test
    public void ten_should_return_Buzz() {
        assertThat(of(10)).isEqualTo("Buzz");
    }

    @Test
    public void twenty_should_return_Buzz() {
        assertThat(of(20)).isEqualTo("Buzz");
    }

    private String of(int i) {
        if (isDivisibleByThree(i)) return "Fizz";
        return (isDibisibleByFive(i) ? "Buzz" : String.valueOf(i));
    }

    private boolean isDivisibleByThree(int i) {
        return i % 3 == 0;
    }

    private boolean isDibisibleByFive(int i) {
        return i % 5 == 0;
    }
}
