import java.util.Scanner;

public class QuestaoQuatorze {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int anoAtual;
        int anoNasc;
        int diff;
        
        System.out.println("Informe o atual:");
        anoAtual = in.nextInt();
        System.out.println("Informe ano de nascimento:");
        anoNasc = in.nextInt();

        diff = anoAtual - anoNasc;

        if (diff >= 16) {
            System.out.println("Voce pode votar este ano");
        } else {
            System.out.println("Voce nao pode votar este ano");
        }
    }
}