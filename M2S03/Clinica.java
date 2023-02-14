package DEVinPhilips.M2S03;

import java.util.List;

public class Clinica {
    /*
    Vamos criar um sistema para uma clínica de emagrecimento. Vamos começar pela Classe Clínica. Essa Classe deve ter
    os atributos nome do dono, nome da clínica, CNPJ, endereço (esse deve ser o logradouro) e o código da Clínica.
     */
    String nomeDoDono;
    String nomeDaClinica;
    Long CNPJ;
    String logradouro;
    Integer codigoDaClinica;
    List<Cliente> clientesDaClinica;

    /*
    Vamos criar um método para calcular o IMC dos pacientes que veem a Clínica. Crie esse método dentro da classe
    Clínica e esse método deve retornar o número do IMC e também deve exibir no console qual é a categoria do IMC da
    pessoa com base na tabela em anexo.

    Esse método deve receber os parâmetros: peso e altura

    Formula IMC = peso / (altura)².
     */
    public Double calcularIMC(Double peso, Double altura) {
        Double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) System.out.println("Abaixo do peso.");
        else if (imc < 25) System.out.println("Peso ideal.");
        else if (imc < 30) System.out.println("Levemente acima do peso.");
        else if (imc < 35) System.out.println("Obesidade grau 1.");
        else if (imc < 40) System.out.println("Obesidade grau 2 (severa).");
        else System.out.println("Obesidade grau 3 (mórbida).");

        return imc;
    }
}
