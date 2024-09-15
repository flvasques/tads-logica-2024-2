import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double numero;

        System.out.println("Informe um valor.");
        numero = in.nextDouble();

        if (numero >= 0) {
            System.out.println("Valor e positivo");
        } else {
            System.out.println("Valor e Negativo");
        }
    }
}