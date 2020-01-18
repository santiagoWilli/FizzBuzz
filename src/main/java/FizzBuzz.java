public class FizzBuzz {

    String of(int number) {
        if ((! isDivisibleByThree(number) && ! isDibisibleByFive(number))) return String.valueOf(number);
        return fizzOf(number) + buzzOf(number);
    }

    private String fizzOf(int number) {
        if (isDivisibleByThree(number)) return "Fizz";
        return "";
    }

    private String buzzOf(int number) {
        if (isDibisibleByFive(number)) return "Buzz";
        return "";
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    private boolean isDibisibleByFive(int number) {
        return number % 5 == 0;
    }
}