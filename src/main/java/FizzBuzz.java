public class FizzBuzz {

    String of(int i) {
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