import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double numero;

        System.out.println("Informe um numero");
        numero = in.nextDouble();
        
        numero = numero + (numero * 0.2);

        System.out.print("Numero mais 20%: ");
        System.out.println(numero);

    }
}