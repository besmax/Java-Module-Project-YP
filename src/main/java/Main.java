public class Main {

    public static void main(String[] args) {
        Console console = new Console();

        console.print("На скольких человек необходимо разделить счёт");
        int numberOfPeople = console.readInt();
        if (numberOfPeople == 1)  console.print("На одного человека счёт делить нет смысла");
        if (numberOfPeople < 1)  console.print("Введено некорректное число человек, попробуйте ещё раз");
        if (numberOfPeople > 1) {
            Calculator calculator = new Calculator(numberOfPeople);
            while (true) {
                console.print("введите наименование товара");
                String nameOfItem = console.read();
                if (nameOfItem.equalsIgnoreCase("завершить")) {
                    console.print(calculator.calculate());
                    return;
                }
                console.print("Пожалуйста, введите стоимость товара в формате \"ХХ,хх\", где ХХ - рубли, хх - копейки");
                double priceOfItem = console.readDouble();
                calculator.addItem(new Item(nameOfItem, priceOfItem));
                console.print("Товар " + nameOfItem + " стоимостью " + priceOfItem + " добавлен");
                console.print("Введите \"завершить\" чтобы рассчитать или");
            }

        }
    }

}
