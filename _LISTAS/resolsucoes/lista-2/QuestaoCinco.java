import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double valor1;
        double valor2;
        double resultado;

        System.out.println("Informe dividendo.");
        valor1 = in.nextDouble();
        System.out.println("Informe o divisor.");
        valor2 = in.nextDouble();
 
        if (valor2 > 0) {
            resultado = valor1 / valor2;
            System.out.printf("Quociente: %.2f.", resultado);
        } else {
            System.out.println("FALHA divisor deve ser maior que zero (0).");
        }
    }
}