import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("Informe um numero");
        numero = in.nextInt();
        
        numero += numero;

        System.out.print("O dobro: ");
        System.out.println(numero);

    }
}