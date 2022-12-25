import java.util.InputMismatchException;

public class Main {
    private static Console console = new Console();
    private static int numberOfPeople = 0;

    public static void main(String[] args) {

        while (numberOfPeople <= 1) {
            numberOfPeople = getNumberOfPeopleFromUser();
        }

        Calculator calculator = new Calculator(numberOfPeople);
        while (true) {
            console.print("введите наименование товара");
            String nameOfItem = console.read();
            if (nameOfItem.equalsIgnoreCase("завершить")) {
                console.print(calculator.calculate());
                return;
            }
            console.print("Пожалуйста, введите стоимость товара в формате \"ХХ,хх\", где ХХ - рубли, хх - копейки");
            double priceOfItem = 0;
            try {
                priceOfItem = console.readDouble();
            } catch (InputMismatchException e) {
                console.print("Введена некорректная стоимость, стоимость  товара должна быть больше 0");
            }

            calculator.addItem(new Item(nameOfItem, priceOfItem));
            if (priceOfItem > 0) console.print("Товар " + nameOfItem + " стоимостью " + priceOfItem + " добавлен");
            if (priceOfItem <= 0) console.print("Товар " + nameOfItem + " не был добавлен из-за некорректной стоимости");

            console.print("Введите \"завершить\" чтобы рассчитать или");
        }

    }

    public static int getNumberOfPeopleFromUser() {
        console.print("На скольких человек необходимо разделить счёт");
        int result = console.readInt();
        if (result == 1)  console.print("На одного человека счёт делить нет смысла");
        if (result < 1)  console.print("Введено некорректное число человек, попробуйте ещё раз");
        return result;
    }

}
