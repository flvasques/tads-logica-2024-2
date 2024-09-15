import java.util.Scanner;

public class QuestaoVinte {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double kmInicio;
        double kmFinal;
        double kmDia;
        double litros;
        double valorAferido;
        double valorCombustivel;
        double kmL;
        double luro;
        final double valorLitro = 4.599;

        System.out.println("Imforme o odometro do inicio do dia:");
        kmInicio = in.nextDouble();
        System.out.println("Imforme o odometro do final do dia:");
        kmFinal = in.nextDouble();
        System.out.println("Combustivel gasto (L):");
        litros = in.nextInt();
        System.out.println("Rendimento do dia (R$):");
        valorAferido = in.nextInt();
        
        kmDia = kmFinal - kmInicio;
        kmL = kmDia / litros;
        valorCombustivel = valorLitro * litros;
        luro = valorAferido - valorCombustivel;
        
        System.out.printf("Quilometragem percorrida %.2f Km\n", kmDia);        
        System.out.printf("Consumo                  %.2f Km/L\n", kmL);        
        System.out.printf("Valor aferido            R$ %.2f\n", valorAferido);
        System.out.printf("Custo com combustivel    R$ %.2f\n", valorCombustivel);
        System.out.printf("Lucro do dia             R$ %.2f\n", luro);
       
    }

}