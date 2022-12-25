import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public void print(String text) {
        System.out.println(text);
    }

    public String read() {
        return scanner.next();
    }

    public int readInt() {
        return scanner.nextInt();
    }

    public double readDouble() {
        return scanner.nextDouble();
    }

}