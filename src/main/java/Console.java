import java.util.Scanner;

public class Console {

    public void print(String text) {
        System.out.println(text);
    }

    public String read() {
            return new Scanner(System.in).nextLine();
    }

    public int readInt() {
            return new Scanner(System.in).nextInt();
    }

    public double readDouble() {
            return new Scanner(System.in).nextDouble();
    }

}