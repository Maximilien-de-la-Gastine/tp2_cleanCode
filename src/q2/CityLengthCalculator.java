package Q2;

public class CityLengthCalculator implements Q2.LengthCalculator {

    @Override
    public int calculate(String word) {

        return word.length();
    }
}