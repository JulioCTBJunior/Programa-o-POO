import java.util.Scanner;

public class SequenciaNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, numero = 1, bloco = 0;

        System.out.print("Digite o valor de n: ");
        n = scanner.nextInt();

        while (numero <= n) {
            int numerosNaLinha = 0;
            while (numero <= n && numerosNaLinha < 5) {
                System.out.print(numero);
                if (numero % 5 != 0 && numero != n) {
                    System.out.print(", ");
                } else {
                    System.out.println();
                }
                numero++;
                numerosNaLinha++;
            }
            bloco++;
            if (bloco % 10 == 0) {
                System.out.print("Digite zero (0) para parar a sequencia ou pressione Enter para continuar: ");
                int continuar = scanner.nextInt();
                if (continuar == 0) {
                    break;
                }
            }
        }
    }
}
