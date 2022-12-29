import java.util.Scanner;

public class Console {

<<<<<<< HEAD
=======
    private static Scanner scanner = new Scanner(System.in);

>>>>>>> main
    public void print(String text) {
        System.out.println(text);
    }

    public String read() {
<<<<<<< HEAD
            return new Scanner(System.in).nextLine();
    }

    public int readInt() {
            return new Scanner(System.in).nextInt();
    }

    public double readDouble() {
            return new Scanner(System.in).nextDouble();
=======
        return scanner.next();
    }

    public int readInt() {
        return scanner.nextInt();
    }

    public double readDouble() {
        return scanner.nextDouble();
>>>>>>> main
    }

}