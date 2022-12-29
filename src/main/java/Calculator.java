<<<<<<< HEAD
import static java.lang.Math.pow;

=======
>>>>>>> main
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

<<<<<<< HEAD
        result.append(addRublesToResult(costSum / numberOfPeople));
=======
        addRublesToResult(costSum / numberOfPeople);
>>>>>>> main

        return result.toString();
    }

    public void addItem(Item item) {
        if (item.getPrice() > 0) {
            items.add(item);
            costSum += item.getPrice();
        }
    }

<<<<<<< HEAD
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
=======
    public void addRublesToResult(double costForEachPerson) {
        int costForEachPersonInt = (int) costForEachPerson;
        switch (Integer.toString(costForEachPersonInt).substring(Integer.toString(costForEachPersonInt).length() - 2)) {
            case "01":
                result.append(" рубль");
                break;
            case "02":
            case "22":
            case "32":
            case "42":
            case "52":
            case "62":
            case "72":
            case "82":
            case "92":
            case "03":
            case "23":
            case "33":
            case "43":
            case "53":
            case "63":
            case "73":
            case "83":
            case "93":
            case "04":
            case "24":
            case "34":
            case "44":
            case "54":
            case "64":
            case "74":
            case "84":
            case "94":
                result.append(" рубля");
                break;
            default:
                result.append(" рублей");
                break;
        }
>>>>>>> main
    }
}