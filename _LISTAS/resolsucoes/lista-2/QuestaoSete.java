import java.util.Scanner;


public class QuestaoSete {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double salarioHora;
        double horasTrabalhadas;
        double impostos;
        double salarioBruto;
        double salarioLiquido;

        System.out.println("Informe o salario por hora:");
        salarioHora = in.nextDouble();
        System.out.println("Informe as horas trabalhadas:");
        horasTrabalhadas = in.nextDouble();
        System.out.println("Informe os  a porcetagem(%) de impostos descontados");
        impostos = in.nextDouble();

        salarioBruto = salarioHora * horasTrabalhadas;
        impostos /= 100;
        salarioLiquido = salarioBruto - (salarioBruto * impostos);

        System.out.println("Redimentos:");
        System.out.printf("Bruto   R$ %.2f\n", salarioBruto);
        System.out.printf("Liquido R$ %.2f\n", salarioLiquido);
    }

}