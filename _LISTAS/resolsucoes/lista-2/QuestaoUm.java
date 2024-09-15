import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double numero;

        System.out.println("Informe o valor em metros.");
        numero = in.nextDouble();
        
        numero *= 100;

        System.out.printf("Valor %.4f cm.\n", numero);

    }
}