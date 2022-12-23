import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private int numberOfPeople;
    private double costSum;
    private List<Item> items = new ArrayList<>();


    public Calculator(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String calculate() {
        StringBuilder result = new StringBuilder("Добавленные товары:");
        for (Item item : items) result.append(System.lineSeparator())
                                      .append(item.getName());
        result.append(System.lineSeparator())
                .append("С каждого человека по ")
                .append(String.format("%.2f",costSum/numberOfPeople));
        return result.toString();
    }

    public void addItem(Item item){
        items.add(item);
        costSum+=item.getPrice();
    }
}