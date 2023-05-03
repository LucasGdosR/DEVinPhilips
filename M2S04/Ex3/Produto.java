package DEVinPhilips.M2S04.Ex3;

public class Produto implements Tributavel {
    private double valor;
    private double valorImposto;

    @Override
    public double calcularValorComImposto() {
        return Double.sum(valor, valorImposto);
    }
}
