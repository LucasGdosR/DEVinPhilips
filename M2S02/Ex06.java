package DEVinPhilips.M2S02;

import java.util.Arrays;
import java.util.List;

public class Ex06 {
    /*
    Dado a lista de números:

List<Integer> lista = Arrays.asList(1,2,3,4);

Percorra a lista e gere uma nova com o triplo do valor de cada elemento:
     */
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4);
        List<Integer> tripledList = lista.stream().map(number -> number * 3).toList();
        System.out.println(tripledList);
    }
}
