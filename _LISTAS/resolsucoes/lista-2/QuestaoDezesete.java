import java.util.Scanner;

public class QuestaoDezesete {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double custo;
        double custoFinal;
        final double percentualDistribuidor = 0.28;
        final double percentualImpostos = 0.45;
        
        System.out.println("Informe o valor de custo:");
        custo = in.nextDouble();

        custoFinal = custo + (custo * percentualDistribuidor) + (custo * percentualImpostos);

        System.out.printf("Custo final R$ %.2f", custoFinal);
       
    }

}