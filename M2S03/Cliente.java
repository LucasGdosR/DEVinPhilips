package DEVinPhilips.M2S03;

public class Cliente {
    private Double peso;
    private Double altura;
    private Integer idade;
    private String nome;

    public Cliente(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Cliente(Double peso, Double altura, Integer idade) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public Double emagrecer(Double peso) {
        this.peso -= peso;
        return this.peso;
    }

    public String getNome() {
        return nome;
    }
}
