package DEVinPhilips.M2S03;

public class Cliente {
    /*
    Crie uma classe Cliente que contenha os atributos peso, altura e idade.

    Adicione um novo atributo na Classe Clinica que receba uma Lista de Clientes, essa Lista deve conter todos os
    Cliente dessa Clinica.
     */
    private Double peso;
    private Double altura;
    private Integer idade;

    private String nome;

    /*
    Adicioner construtores e cada classe anterior.
    Adicione na Classe Cliente um construtor que receba apenas altura e peso e um construtor que receba todos os atributos.


    Adicione na Classe Clinica um construtor que recebe apenas o nome do dono e um construtor que rebe o nome do dono e
    um Lista de Clientes.
     */

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
