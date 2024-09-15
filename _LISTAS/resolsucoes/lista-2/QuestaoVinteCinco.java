import java.util.Scanner;

public class QuestaoVinteCinco {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valorAlvo;
        double valorPosuido;
        final double valor50 = 0.5;
        final double valor25 = 0.25;
        final double valor10 = 0.1;
        final double valor05 = 0.05;
        int moeda1;
        int moeda50;
        int moeda25;
        int moeda10;
        int moeda05;

        System.out.println("Informe o valor do produto:");
        valorAlvo = in.nextDouble();
        System.out.println("Informe quantas moedas de R$ 1,00 possui:");
        moeda1 = in.nextInt();
        System.out.println("Informe quantas moedas de R$ 0,50 possui:");
        moeda50 = in.nextInt();
        System.out.println("Informe quantas moedas de R$ 0,25 possui:");
        moeda25 = in.nextInt();
        System.out.println("Informe quantas moedas de R$ 0,10 possui:");
        moeda10 = in.nextInt();
        System.out.println("Informe quantas moedas de R$ 0,05 possui:");
        moeda05 = in.nextInt();

        valorPosuido = moeda1 + (moeda50 * valor50) + (moeda25 * valor25) + (moeda10 * valor10) + (moeda05 * valor05);

        System.out.printf("Voce possui R$ %.2f\n", valorPosuido);
        if (valorPosuido >= valorAlvo) {
            System.out.println("Economizou o suficiente para comprar o produto.");
        } else {
            System.out.println("Ainda NAO economizou o suficiente para comprar o produto.");
        }
    }
}