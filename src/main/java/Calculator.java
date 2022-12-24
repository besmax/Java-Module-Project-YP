import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private int numberOfPeople;
    private double costSum;
    private List<Item> items = new ArrayList<>();
    private StringBuilder result = new StringBuilder("Добавленные товары:");


    public Calculator(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String calculate() {

        String costForEachPersonString = (String.format("%.2f", costSum/numberOfPeople));
        for (Item item : items) result.append(System.lineSeparator())
                                      .append("   ")
                                      .append(items.indexOf(item) + 1)
                                      .append(".  ")
                                      .append(item.getName());
        result.append(System.lineSeparator())
                .append("С каждого человека по ")
                .append(costForEachPersonString);

        addRublesToResult(costForEachPersonString);

        return result.toString();
    }

    public void addItem(Item item){
        if (item.getPrice() > 0) {
            items.add(item);
            costSum+=item.getPrice();
        }
    }

    public void addRublesToResult(String costForEachPersonString) {
        switch (costForEachPersonString.charAt(costForEachPersonString.length() - 4)){
            case '1':
                result.append(" рубль");
                break;
            case '2':
            case '3':
            case '4':
                result.append(" рубля");
                break;
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '0':
                result.append(" рублей");
                break;
        }
    }
}