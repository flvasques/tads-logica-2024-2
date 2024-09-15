import java.util.Scanner;

public class QuestaoVinteQuatro {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idadeHomem1;
        int idadeHomem2;
        int idadeMulher1;
        int idadeMulher2;
        int velho;
        int novo;
        int velha;
        int nova;
        int soma;
        int produto;

        System.out.println("Informe a idade do primeiro Homem:");
        idadeHomem1 = in.nextInt();
        System.out.println("Informe a idade do sugundo Homem:");
        idadeHomem2 = in.nextInt();
        System.out.println("Informe a idade da primeira mulher:");
        idadeMulher1 = in.nextInt();
        System.out.println("Informe a idade da segunda mulher:");
        idadeMulher2 = in.nextInt();

        velho = idadeHomem1 > idadeHomem2? idadeHomem1 : idadeHomem2;
        novo = idadeHomem1 < idadeHomem2? idadeHomem1 : idadeHomem2;

        velha = idadeMulher1 > idadeMulher2? idadeMulher1 : idadeMulher2;
        nova = idadeMulher1 < idadeMulher2? idadeMulher1 : idadeMulher2;

        soma = velho + nova;
        produto = novo * velha;

        System.out.printf("Idade do homem mais velho %d anos\n", velho);
        System.out.printf("Idade do homem mais novo %d anos\n", novo);
        System.out.printf("Idade do mulher mais velha %d anos\n", velha);
        System.out.printf("Idade do mulher mais nova %d anos\n", nova);
        System.out.printf("Somatorio %d anos e porduto %d anos\n", soma, produto);
    }

}