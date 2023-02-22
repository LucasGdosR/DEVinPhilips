package DEVinPhilips.M2S04.Ex5;

public class Pessoa {
    protected String nome;
    protected String sobrenome;

    protected String obterNomeCompleto() {
        return nome.concat(" ").concat(sobrenome);
    }
}
