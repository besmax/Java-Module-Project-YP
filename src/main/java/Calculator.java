import static java.lang.Math.pow;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private final int numberOfPeople;
    private final List<Item> items = new ArrayList<>();
    private final StringBuilder result = new StringBuilder("Добавленные товары:");
    private double costSum;


    public Calculator(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String calculate() {

        String costForEachPersonString = (String.format("%.2f", costSum / numberOfPeople));
        for (Item item : items)
            result.append(System.lineSeparator())
                    .append("   ")
                    .append(items.indexOf(item) + 1)
                    .append(".  ")
                    .append(item.getName());
        result.append(System.lineSeparator())
                .append("С каждого человека по ")
                .append(costForEachPersonString);

        result.append(addRublesToResult(costSum / numberOfPeople));

        return result.toString();
    }

    public void addItem(Item item) {
        if (item.getPrice() > 0) {
            items.add(item);
            costSum += item.getPrice();
        }
    }

    public String addRublesToResult(double costForEachPerson) {
        int twoLastDigits = getTwoLastDigits((int) costForEachPerson);
        if (getTwoLastDigits((int) costForEachPerson) > 10 && getTwoLastDigits((int) costForEachPerson) < 15) return " рублей";
        else if (getTwoLastDigits((int) costForEachPerson) % 10 == 1) return " рублю";
        else if (getTwoLastDigits((int) costForEachPerson) % 10 > 1 && getTwoLastDigits((int) costForEachPerson) % 10 < 5) return " рубля";
        else return " рублей";
    }

    public int getTwoLastDigits(int number) {
        int result = number;

        while (result >= 100) result = (int) (result - (pow(10, (getNumberLength(result)) - 1) *
                trimNumber(result, getNumberLength(result) - 1)));
        return result;
    }

    public int getNumberLength(int number) {
        return (int) (Math.log10(number) + 1);
    }

    public int trimNumber(int number, int digits) {
        return (int) (number/ pow(10, digits));
    }
}