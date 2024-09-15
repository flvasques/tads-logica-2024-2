import java.util.Scanner;

public class QuestaoOnze {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valor1;
        int valor2;
        int resultado;

        System.out.println("Informe o primeiro valor:");
        valor1 = in.nextInt();

        System.out.println("Informe o sugundo valor:");
        valor2 = in.nextInt();

        resultado = valor1 + valor2;

        if(resultado > 20) {
            resultado += 8;
            System.out.printf("Resultado adcionado 8: %d\n", resultado);
        } else {
            resultado -= 10;
            System.out.printf("Resultado subtriado 10: %d\n", resultado);
        }

    }
}