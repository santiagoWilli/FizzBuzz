import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {
    @Test
    public void one_should_return_1() {
        assertThat(of(1)).isEqualTo("1");
    }

    private String of(int i) {
        return "1";
    }
}
