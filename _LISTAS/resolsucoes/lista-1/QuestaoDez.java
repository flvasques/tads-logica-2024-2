import java.util.Scanner;

public class QuestaoDez {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int totalSocios;
        int totalCriancas;
        int totalComum;
        int publicoTotal;
        double valorIngresso;
        double valorTotal;
        double ingressoSocio;
        double valorNaoArrecadado;
        final double desconto = 0.3;

        System.out.println("Informe o valor do ingresso.");
        valorIngresso = in.nextDouble(); 
        System.out.println("Informe o total de pagantes nao socios.");
        totalComum = in.nextInt(); 
        System.out.println("Informe o total de socios.");
        totalSocios = in.nextInt();
        System.out.println("Informe o total de criancas.");
        totalCriancas = in.nextInt();

        ingressoSocio = valorIngresso - (valorIngresso * desconto);
        valorTotal = (totalComum * valorIngresso) + (ingressoSocio * totalSocios);
        publicoTotal = totalComum + totalSocios + totalCriancas;
        valorNaoArrecadado = (totalCriancas * valorIngresso) + ((valorIngresso * desconto) * totalSocios);

        System.out.printf("Publico total no evento %d.\n", publicoTotal);
        System.out.printf("Valor total arrecadado R$ %.2f.\n", valorTotal);
        System.out.printf("Valor total nao arrecadado R$ %.2f.\n", valorNaoArrecadado);
    }
}