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

        addRublesToResult(costSum / numberOfPeople);

        return result.toString();
    }

    public void addItem(Item item) {
        if (item.getPrice() > 0) {
            items.add(item);
            costSum += item.getPrice();
        }
    }

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
    }
}