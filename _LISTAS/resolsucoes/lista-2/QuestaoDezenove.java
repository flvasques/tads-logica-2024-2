import java.util.Scanner;

public class QuestaoDezenove {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double comprimento;
        double altura;
        double largura;
        double areaParede1;
        double areaParede2;
        final double areaCaixa = 1.5;
        int caixasParede1;
        int caixasParede2;
        int totalCaixas;
        
        System.out.println("Informe o comprimento:");
        comprimento = in.nextDouble();
        System.out.println("Informe a altura:");
        altura = in.nextDouble();
        System.out.println("Informe a largura:");
        largura = in.nextInt();
        
        areaParede1 = altura * comprimento;
        areaParede2 = altura * largura;

        caixasParede1 = (int) Math.ceil((areaParede1 / areaCaixa));
        caixasParede2 = (int) Math.ceil((areaParede2 / areaCaixa));
        totalCaixas = (caixasParede1 * 2) + (caixasParede2 * 2);

        System.out.printf("Total de caixas %d", totalCaixas);
       
    }

}