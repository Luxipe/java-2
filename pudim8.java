import java.util.Scanner;
public class pudim8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O resultado da área, é a base multplicado pela altura. Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Agora digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é:" + area);

        scanner.close();
    }
}
