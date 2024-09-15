import java.util.Scanner;

public class QuestaoDezoito {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario;
        double valorVendas;
        double totalSalario;
        double percutalComissao;
        final double percentualBonus = 0.05;
        int numeroVeiculo;
        
        System.out.println("Informe o salario base:");
        salario = in.nextDouble();
        System.out.println("Informe o total de vendas:");
        valorVendas = in.nextDouble();
        System.out.println("Informe numero de carros vendidos:");
        numeroVeiculo = in.nextInt();
        System.out.println("Informe a comissao por carros:");
        percutalComissao = in.nextDouble();
        
        percutalComissao /= 100;
        totalSalario = salario + (salario * (percutalComissao * numeroVeiculo)) + (valorVendas * percentualBonus);

        System.out.printf("Redimento total R$ %.2f", totalSalario);
       
    }

}