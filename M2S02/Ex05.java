package DEVinPhilips.M2S02;

public class Ex05 {
    /*
    Implemente uma função 'calcular' que receba como parâmetro um
    array (numérico) e identifique o maior e menor  valor do mesmo.
    Imprima no console estes valores ou "Não é possível calcular"
    qdo não for possível.

Teste a função com as seguintes entradas:

- {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47}
- {1}
- {1, -1}
- null
- {-2,-2,-2,-2}
- {20,10, 30}
     */
    public static void main(String[] args) {
        int[] teste1 = {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47};
        calcular(teste1);

        int[] teste2 = {1};
        calcular(teste2);

        int[] teste3 = {1, -1};
        calcular(teste3);

        try {
            calcular(null);
        } catch (Exception e) {
            System.out.println("Não é possível calcular.\n");
        }

        int[] teste5 = {-2, -2, -2, -2};
        calcular(teste5);

        int[] teste6 = {20, 10, 30};
        calcular(teste6);
    }

    static void calcular(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max)
                max = number;
            else if (number < min)
                min = number;
        }

        System.out.printf("Maior valor: %d\nMenor valor: %d\n\n", max, min);
    }
}
