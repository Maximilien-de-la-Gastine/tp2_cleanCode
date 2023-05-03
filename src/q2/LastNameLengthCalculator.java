package q2;

public class LastNameLengthCalculator implements Q2.LengthCalculator {
    @Override
    public int calculate(String input) {
        return input.split(" ")[1].length();
    }

}
