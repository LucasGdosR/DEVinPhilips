package DEVinPhilips.M2S03;

import java.util.List;

public class Clinica {
    /*
    Vamos criar um sistema para uma clínica de emagrecimento. Vamos começar pela Classe Clínica. Essa Classe deve ter
    os atributos nome do dono, nome da clínica, CNPJ, endereço (esse deve ser o logradouro) e o código da Clínica.
     */
    private String nomeDoDono;
    private String nomeDaClinica;
    private Long CNPJ;
    private String logradouro;
    private Integer codigoDaClinica;
    /*
    Adicione um encapsulamento nas classes criadas anteriormente. Para o atributo Lista de Cliente adicione um método
    que nos permita adicionar um Cliente por vez a essa lista.
     */
    private List<Cliente> clientesDaClinica;

    public Clinica(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public Clinica(String nomeDoDono, List<Cliente> clientesDaClinica) {
        this.nomeDoDono = nomeDoDono;
        this.clientesDaClinica = clientesDaClinica;
    }

    public void adicionarCliente(Cliente novoCliente){
        clientesDaClinica.add(novoCliente);
    }
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

    /*
    Crie um método chamado tratamento que receba um Cliente, esse método vai reduzir o peso do Cliente em 5 quilos e
    após isso irá retornar o novo peso do Cliente.

    Esse método deve receber como parâmetros o id do Cliente na lista da clinica, e caso o cliente não exista ele deve
    exibir uma mensagem dizendo “cliente não identificado“. O peso do Cliente identificado deve ser alterada após a
    execução do método.
     */

    public Double tratamento(int idDoCliente) {
        try {
            return this.clientesDaClinica.get(idDoCliente).emagrecer(5D);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cliente não identificado.");
        }
    }
}
