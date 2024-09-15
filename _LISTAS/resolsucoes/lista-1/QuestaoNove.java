import java.util.Scanner;

public class QuestaoNove {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int homens;
        int mulheres;
        int criancas;
        double totalCarne;
        final double margemSeguranca = 0.2;
        final double carneHomens = 0.4;
        final double carneMulheres = 0.32;
        final double carneCriancas = 0.2;

        System.out.println("Informe o total de convidados homens.");
        homens = in.nextInt();
        System.out.println("Informe o total de convidadas mulheres.");
        mulheres = in.nextInt();
        System.out.println("Informe o total de convidados criancas.");
        criancas = in.nextInt();

        totalCarne = ((homens * carneHomens) + (mulheres * carneMulheres) + (criancas * carneCriancas));
        totalCarne = (totalCarne + (totalCarne * margemSeguranca));

        System.out.printf("Voce deve comprar %.2f kg de carne.\n", totalCarne);
    }
}