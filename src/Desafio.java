import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double numeroDigitado = 0;
        int numeroDaSorte = new Random().nextInt(100);
        //int numeroDaSorte = 3;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número que acha que é o da sorte ");
            numeroDigitado = leitura.nextDouble();
            if (numeroDaSorte == numeroDigitado ) {
                System.out.println("Você acertou o numero da sorte é: " + numeroDaSorte);
                break;
            }
            if (i == 4) {
                System.out.println("Tentativas esgotadas, o número da sorte era: " + numeroDaSorte);
            }
        }

    }
}
