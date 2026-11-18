import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Hola Mundo");
        System.out.println("Dame un número para la suma");
        int a = tec.nextInt();
        System.out.println("Dame otro número para la suma");
        int b = tec.nextInt();
        System.out.println(suma(a, b));
    }

    private static int suma(int a, int b) {
        return a + b;
    }
}
