import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("Informe a base.");
        base = in.nextInt();
        System.out.println("Informe a altura.");
        altura = in.nextInt();
        area = base * altura;

        System.out.printf("Valor da area: %.2f.\n", area);

    }
}