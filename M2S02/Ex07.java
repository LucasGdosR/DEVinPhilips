package DEVinPhilips.M2S02;

import java.util.Arrays;
import java.util.List;

public class Ex07 {
    /*
    Dado a lista de nomes:

List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");

a) Percorra a lista usando o operador 'for' clássico, usando uma
variável para iterar pelos índices, e imprima no console os valores
de cada nome;
b) Percorra a lista usando o operador 'for-each' usando a forma
simplificada, e imprima no console os valores de cada nome;
c) Percorra a lista usando o operador 'while', e imprima no console
os valores de cada nome;
     */
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");
        for (int i = 0; i < nomes.size(); i++)
            System.out.println(nomes.get(i));

        nomes.forEach(System.out::println);

        int i = 0;
        while (i < nomes.size())
            System.out.println(nomes.get(i++));
    }
}
