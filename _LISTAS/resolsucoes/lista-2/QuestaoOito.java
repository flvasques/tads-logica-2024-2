import java.util.Scanner;


public class QuestaoOito {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int totalEleitores;
        int votos;
        int brancos;
        int nulos;
        double percVotos;
        double percBrancos;
        double percNulos;

        System.out.println("Informe o total de eleitores:");
        totalEleitores = in.nextInt();
        System.out.println("Informe o total de votos validos:");
        votos = in.nextInt();
        System.out.println("Informe o total de votos em branco:");
        brancos = in.nextInt();
        System.out.println("Informe o total de votos nulos:");
        nulos = in.nextInt();

        percVotos = (double)((votos * 100) / totalEleitores);
        percBrancos = (double)((brancos * 100) / totalEleitores);
        percNulos = (double)((nulos * 100) / totalEleitores);

        System.out.printf("Percentual de votos validos %.2f\n", percVotos);
        System.out.printf("Percentual de votos em branco %.2f\n", percBrancos);
        System.out.printf("Percentual de votos nulos %.2f\n", percNulos);

    }

}