import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Informe a base");
        base = in.nextDouble();
        System.out.println("Informe a altura");
        altura = in.nextDouble();
        area = (base * altura) /2;

        System.out.print("Area total do triangulo: ");
        System.out.println(area);

    }
}