import java.util.Scanner;

public class QuestaoTreze {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;
        final double aprovado = 6.0;
        
        System.out.println("Informe primeira nota:");
        nota1 = in.nextDouble();
        System.out.println("Informe segunda nota:");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= aprovado) {
            System.out.print("Aluno aprovado ");
        } else {
            System.out.print("Aluno reprovado ");
        }
        System.out.printf("com media %.2f.\n", media);
    }
}