import java.util.Scanner;

public class BaseConverter {
    public static String decimalToBase(int number, int base) {
        if (number == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            result.insert(0, number % base);
            number /= base;
        }
        return result.toString();
    }

    public static int baseToDecimal(String number, int base) {
        int decimal = 0;
        int power = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(number.charAt(i));
            decimal += digit * Math.pow(base, power);
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversao entre bases numericas");
        System.out.print("Digite o numero: ");
        int number = scanner.nextInt();
        System.out.print("Digite a base do numero (2, 8, 10 ou 16): ");
        int fromBase = scanner.nextInt();
        System.out.print("Digite a base para conversao (2, 8, 10 ou 16): ");
        int toBase = scanner.nextInt();

        String convertedNumber;
        if (fromBase == 10) {
            convertedNumber = decimalToBase(number, toBase);
        } else {
            int decimalNumber = baseToDecimal(Integer.toString(number), fromBase);
            convertedNumber = decimalToBase(decimalNumber, toBase);
        }

        System.out.printf("O numero %d na base %d e equivalente a %s na base %d.%n", number, fromBase, convertedNumber, toBase);
    }
}
