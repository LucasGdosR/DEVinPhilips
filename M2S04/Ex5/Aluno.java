package DEVinPhilips.M2S04.Ex5;

public class Aluno extends Pessoa {
    private String matrícula;

    public String registrar() {
        return "Sou o %s e minha matrícula é %s".formatted(super.obterNomeCompleto(), matrícula);
    }
}
