import java.util.Scanner;

public class Console {

    public void print(String text) {
        System.out.println(text);
    }

    public void print(int text) {
        System.out.println(text);
    }

    public String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public double readDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}