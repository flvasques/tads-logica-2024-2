import java.util.Scanner;

public class QuestaoOito {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int eleitores, votos, brancos, nulos;
        double percentualValido, percentualBranco, percentualNulo;

        System.out.println("Informe o numero de eleitores.");
        eleitores = in.nextInt();
        System.out.println("Informe o total de votos validos.");
        votos = in.nextInt();
        System.out.println("Informe o total de votos em branco.");
        brancos = in.nextInt();
        System.out.println("Informe o total de votos nulos.");
        nulos = in.nextInt();

        percentualValido = (double)((votos * 100) / eleitores);
        percentualBranco = (double)((brancos * 100) / eleitores);
        percentualNulo = (double)((nulos * 100) / eleitores);

        System.out.printf("Percentual de votos validos %.2f\n", percentualValido);
        System.out.printf("Percentual de votos em branco %.2f\n", percentualBranco);
        System.out.printf("Percentual de votos nulos %.2f\n", percentualNulo);

    }
}