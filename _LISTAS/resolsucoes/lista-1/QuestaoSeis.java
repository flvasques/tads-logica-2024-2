import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Informe a primeira nota");
        nota1 = in.nextDouble();
        System.out.println("Informe a segunda nota");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.print("Media final: ");
        System.out.printf ("%.2f", media);

    }
}