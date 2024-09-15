import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double distancia, velocidade, tempo;

        System.out.println("Informe a distancia em KM.");
        distancia = in.nextDouble();
        System.out.println("Informe a volicidade media (KM/H).");
        velocidade = in.nextDouble();

        tempo = distancia / velocidade;

        System.out.print("A viagem levará (hs): ");
        System.out.printf ("%.2f", tempo);

    }
}