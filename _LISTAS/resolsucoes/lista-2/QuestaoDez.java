import java.util.Scanner;

public class QuestaoDez {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int idade;

        System.out.println("Informe a idade:");
        idade = in.nextInt();

        if (idade >= 18) {
            System.out.println("Nadador Adulto");
        } else if ((idade >= 14) && (idade < 18)) {
            System.out.println("Nadador Juvenil");
        } else if ((idade >= 9) && (idade < 14)) {
            System.out.println("Nadador Infantil");
        } else if ((idade < 9)) {
            System.out.println("Nadador Mirin");
        }

    }
}