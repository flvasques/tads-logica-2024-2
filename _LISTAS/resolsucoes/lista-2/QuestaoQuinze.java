import java.util.Scanner;

public class QuestaoQuinze {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int horaInicio;
        int horafim;
        int diff;
        
        System.out.println("Informe a hora de inicio (formato 24hs):");
        horaInicio = in.nextInt();
        System.out.println("Informe a hora de finalizacao (formato 24hs):");
        horafim = in.nextInt();

        if (horaInicio > horafim) {
            diff = (24 - horaInicio) + horafim;
        } else {
            diff = horafim - horaInicio;
        }

        System.out.printf("O jogo levou: %d horas.\n", diff);
    }
}