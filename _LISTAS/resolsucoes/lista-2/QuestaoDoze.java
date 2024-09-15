import java.util.Scanner;

public class QuestaoDoze {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int totalMacas;
        final int minimoAtacado = 12;
        double valorTotal;
        final double varejo = 1.5;
        final double atacado = 1.3;
        
        System.out.println("Informe quantas maças serao levadas:");
        totalMacas = in.nextInt();

        if (totalMacas >= minimoAtacado) {
            valorTotal = totalMacas * atacado;
        } else {
            valorTotal = totalMacas * varejo;
        }
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);
    }
}