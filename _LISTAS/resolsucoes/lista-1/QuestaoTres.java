import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("Informe um numero");
        numero = in.nextInt();
        
        numero *= numero;

        System.out.print("O quadrado do numero: ");
        System.out.println(numero);

    }
}