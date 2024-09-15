import java.util.Scanner;

public class QuestaoVinteDois {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String conta;
        double saldo;
        double debito;
        double credito;


        System.out.println("Informe o numero da conta:");
        conta = in.nextLine();
        System.out.println("Informe o saldo atual (R$):");
        saldo = in.nextDouble();
        System.out.println("Informe o valor a ser debitado (R$):");
        debito = in.nextDouble();
        System.out.println("Informe o valor a ser creditado (R$):");
        credito = in.nextDouble();

        saldo = saldo - debito + credito;
        
        if(saldo >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
       
    }

}