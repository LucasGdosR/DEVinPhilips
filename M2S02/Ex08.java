package DEVinPhilips.M2S02;

import java.util.Arrays;
import java.util.List;

public class Ex08 {
    /*
    Localize na lista abaixo e imprima no console a primeira ocorrência de número maior que 50.

List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);
        numeros.stream()
                .filter(number -> number > 50)
                .limit(1)
                .forEach(System.out::println);
    }
}
