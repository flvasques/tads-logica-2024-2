import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.println("Informe primeiro valor.");
        valor1 = in.nextInt();
        System.out.println("Informe segundo valor.");
        valor2 = in.nextInt();
 
        if (valor1 > valor2) {
            System.out.printf("O primeiro valor %d é maior.", valor1);
        } else if (valor1 < valor2) {
            System.out.printf("O segundo valor %d é maior.", valor2);
        } else {
            System.out.println("Os valores são iguais");
        }
    }
}