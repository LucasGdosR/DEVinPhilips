package DEVinPhilips.M2S03;

import java.util.List;

public class Clinica {
    private String nomeDoDono;
    private String nomeDaClinica;
    private Long CNPJ;
    private String logradouro;
    private Integer codigoDaClinica;
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

    public Double tratamento(int idDoCliente) {
        return tratamento(idDoCliente, 5D);
    }

    public Double tratamento(int idDoCliente, Double kgPerdidos) {
        try {
            return this.clientesDaClinica.get(idDoCliente).emagrecer(kgPerdidos);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cliente não identificado.");
            return null;
        }
    }

    public List<Cliente> getClientesDaClinica() {
        this.clientesDaClinica.forEach(cliente -> System.out.println(cliente.getNome()));
        return getClientesDaClinica();
    }
}
