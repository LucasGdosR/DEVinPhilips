package DEVinPhilips.M2S04.Ex1;

public class ContaCorrente extends Conta implements Operavel{
    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        super.saldo -= valor;
    }
}
