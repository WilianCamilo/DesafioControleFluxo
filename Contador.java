import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        int primeiroNumero;
        int segundoNumero;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um numero: ");
            primeiroNumero = scanner.nextInt();

            System.out.println("Digite oum segundo numero: ");
            segundoNumero = scanner.nextInt();

            ParametrosInvalidosException p = new ParametrosInvalidosException(primeiroNumero, segundoNumero);

            System.out.println(" O primeiro parametro é " + primeiroNumero + " e o segundo é " + segundoNumero);

        } catch (RuntimeException invalide) {
            System.out.println(invalide.getMessage());
        }

    }
}