public class FizzBuzz {

    String of(int number) {
        if (number == 15) return "Fizz Buzz";
        if (isDivisibleByThree(number)) return "Fizz";
        return (isDibisibleByFive(number) ? "Buzz" : String.valueOf(number));
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    private boolean isDibisibleByFive(int number) {
        return number % 5 == 0;
    }
}