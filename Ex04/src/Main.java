import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier: ");
        int nombre = scanner.nextInt();

        String binaire = Integer.toBinaryString(nombre);
        String octal = Integer.toOctalString(nombre);
        String hexadecimale = Integer.toHexString(nombre);

        System.out.printf("Binaire: %s\nOctal: %s\nHexadécimale: %s\n",
                binaire, octal, hexadecimale);
    }
}