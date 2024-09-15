import java.util.Scanner;

public class QuestaoDezeseies {
    
    public static void main(String[] args) {

        double salario;
        double valorEmprestimo;
        double valorMargem;
        double valorPretacao;
        int totalPrestacoes;
        final double margemPercentual = 0.3;
        
        System.out.println("Informe o valor do salario:");
        salario = receberDouble();
        System.out.println("Informe valor do emprestimo:");
        valorEmprestimo = receberDouble();
        System.out.println("Informe total de prestacoes:");
        totalPrestacoes = receberInteiro();


        valorMargem = salario * margemPercentual;
        valorPretacao = valorEmprestimo / totalPrestacoes;

        System.out.printf("Rendimento atual      R$ %.2f\n", valorMargem);
        System.out.printf("A margem atual        R$ %.2f\n", valorMargem);
        System.out.printf("Emprestimo solicitado R$ %.2f\n\n", valorEmprestimo);
        System.out.printf("Pago em %d X R$ %.2f\n", totalPrestacoes, valorPretacao);
        
        if (valorPretacao > valorMargem) {
            System.out.println("O valor da prestacao excede de 30% do salario.");
            System.out.println("Emprestimo NEGADO.");
        } else {
            System.out.println("Emprestino APROVADO.");
        }

    }

    public static double receberDouble() {
        Scanner in = new Scanner(System.in);
        double valor = 0.0;
        valor = in.nextDouble();
        while (valor <= 0.0) {
            System.out.println("Este valor deve ser maoir que zero (0) porfavor informe novamente:");
            valor = in.nextDouble();
        }
        return valor;
    }

    public static int receberInteiro() {
        Scanner in = new Scanner(System.in);
        int valor = 0;
        valor = in.nextInt();
        while (valor <= 0.0) {
            System.out.println("Este valor deve ser maoir que zero (0) porfavor informe novamente:");
            valor = in.nextInt();
        }
        return valor;
    }
    

}