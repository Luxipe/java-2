import java.util.Scanner;

public class pudim6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:  ");         // o usuario pode escolher, vai calcular a media.
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double média = (numero1 + numero2 + numero3) /3.0;

        System.out.println("A média dos tres numeros é " + média);
        scanner.close();
    }
}

