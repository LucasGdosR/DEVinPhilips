package DEVinPhilips.M2S04;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean invalidAge = true;

        while (invalidAge) {

            try {
                System.out.println("Digite sua idade:");
                int age = scanner.nextInt();

                if (age < 1 || age > 100)
                    throw new RuntimeException();

                invalidAge = false;
                System.out.printf("Olá, você tem %d anos de idade!\n", age);
            }

            catch (Exception e) {
                System.out.println("Idade inválida. Digite apenas um número de 1 a 100.");
                scanner.nextLine();
            }
        }

    }
}
