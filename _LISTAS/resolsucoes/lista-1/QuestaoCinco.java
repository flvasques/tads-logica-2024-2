import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double celcius, fahrenheit;

        System.out.println("Informe a temperatura ºF");
        fahrenheit = in.nextDouble();

        celcius = ((fahrenheit - 32) /9) * 5;

        System.out.print("Temperatura em  ºC: ");
        System.out.println(celcius);

    }
}