package DEVinPhilips.M2S02;

import java.util.Scanner;

public class Ex10 {
    /*
    Um palíndrome (ou palíndromo), segundo o dicionário Houaiss,
"diz-se de frase ou palavra que se pode ler, indiferentemente, da
esquerda para direita ou vice-versa", como por exemplo:  osso, ana,
radar.
Ou seja, é uma palavra que quando lida de trás pra frente tem o
mesmo significado.

Implemente um código com o que aprendemos até agora que retorne se
determinada palavra é um palíndromo.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palindromeCandidate = scanner.nextLine();

        if(isPalindrome(palindromeCandidate))
            System.out.println("É palíndromo.");
        else System.out.println("Não é palíndromo.");
    }

    static boolean isPalindrome(String palindromeCandidate) {
        String lowerCasePalindromeCandidate = palindromeCandidate.toLowerCase();
        for (int i = 0; i < lowerCasePalindromeCandidate.length() / 2;) {
            if (lowerCasePalindromeCandidate.charAt(i) != lowerCasePalindromeCandidate.charAt(lowerCasePalindromeCandidate.length() - ++i))
                return false;
        }
        return true;
    }
}
