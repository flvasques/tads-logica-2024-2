import java.util.Scanner;

public class QuestaoNove {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final double PI = 3.141692;
        double raio;
        double diametro;
        double perimetro;

        System.out.println("Informe o raio da circuferencia:");
        raio = in.nextDouble();

        diametro = raio * 2;
        perimetro = diametro * PI;

        System.out.printf("Diametro da circunferencia: %.2f\n", diametro);
        System.out.printf("Perimetro da circunferencia: %.2f\n", perimetro);

    }
}