import java.util.Scanner;

public class QuestaoVinteUm {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double comprimento;
        double consumo;
        double litros;
        double distanciaTotal;
        double distanciaReabastecimentos;
        int voltas;
        int reabastecimentos;

        System.out.println("Informe o comprimento da pista(m):");
        comprimento = in.nextDouble();
        System.out.println("Informe o numero de voltas da prova:");
        voltas = in.nextInt();
        System.out.println("Informe o numero de reabastecimentos:");
        reabastecimentos = in.nextInt();
        System.out.println("Informe o consumo(Km/L) do veiculo:");
        consumo = in.nextDouble();

        comprimento /= 1000;
        distanciaTotal = voltas * comprimento;
        distanciaReabastecimentos = distanciaTotal / reabastecimentos;
        litros = consumo / distanciaReabastecimentos;
        
        System.out.printf("Deve abastecer %.2fL\n", litros);        

       
    }

}