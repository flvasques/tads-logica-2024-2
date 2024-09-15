import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class QuestaoSeis {
    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);
        
        String dataNascimento;

        System.out.println("Informe sua data de nascimento (dd/mm/aaaa).");
        dataNascimento = in.nextLine();

        diffLocalDate(dataNascimento);
        diffDate(dataNascimento);
    }

    public static void diffLocalDate(String dataNascimento) {

        LocalDate hoje = LocalDate.now();
        LocalDate data;
        long diferencaEmDias;
        int[] dataArr = new int[3];
        int anos;
        int meses;
        int dias;

        dataArr[0] = Integer.parseInt(dataNascimento.split("/")[0]);
        dataArr[1] = Integer.parseInt(dataNascimento.split("/")[1]);
        dataArr[2] = Integer.parseInt(dataNascimento.split("/")[2]);
        data = LocalDate.of(dataArr[2], dataArr[1], dataArr[0]);
        diferencaEmDias = ChronoUnit.DAYS.between(data, hoje);

        anos = (int) diferencaEmDias / 365;
        meses = (int) ((diferencaEmDias % 365) / 30);
        dias = (int) ((diferencaEmDias % 365) % 30);

        System.out.printf("Voce viveu por %d anos, %d meses e %d dias.\n", anos, meses, dias);

    }

    public static void diffDate(String dataNascimento) throws ParseException {
        Date hojedDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date nascimentoDate = sdf.parse(dataNascimento);
        long diferencaEmDias;
        long diffEmMil;
        int anos;
        int meses;
        int dias;

        diffEmMil = Math.abs(hojedDate.getTime() - nascimentoDate.getTime());
        diferencaEmDias = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);
        
        anos = (int) diferencaEmDias / 365;
        meses = (int) ((diferencaEmDias % 365) / 30);
        dias = (int) ((diferencaEmDias % 365) % 30);

        System.out.printf("Voce viveu por %d anos, %d meses e %d dias.\n", anos, meses, dias);
    }
}