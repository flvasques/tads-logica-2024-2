import java.util.Scanner;

public class QuestaoVinteTres {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double qtdAutal;
        double qtdMax;
        double qtdMin;
        double qtdMedia;

        System.out.println("Informe a quantidade atual:");
        qtdAutal = in.nextDouble();
        System.out.println("Informe a quantidade maxima:");
        qtdMax = in.nextDouble();
        System.out.println("Informe a quantidade minima:");
        qtdMin = in.nextDouble();

        qtdMedia = (qtdMax + qtdMin) / 2;
        
        if(qtdAutal >= qtdMedia) {
            System.out.println("Nao efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
       
    }

}