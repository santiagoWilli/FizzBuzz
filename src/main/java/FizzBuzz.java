public class FizzBuzz {
    public FizzBuzz() {
    }

    String of(int i) {
        if (isDivisibleByThree(i)) return "Fizz";
        return (isDibisibleByFive(i) ? "Buzz" : String.valueOf(i));
    }

    boolean isDivisibleByThree(int i) {
        return i % 3 == 0;
    }

    boolean isDibisibleByFive(int i) {
        return i % 5 == 0;
    }
}