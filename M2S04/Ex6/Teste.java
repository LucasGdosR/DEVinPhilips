package DEVinPhilips.M2S04.Ex6;

import java.util.Objects;

public class Teste {
    public void validar(String valorCampo, Integer valorMaximoCampo) throws TamanhoInvalidoException {
        if (Objects.isNull(valorCampo) ||
            Objects.isNull(valorMaximoCampo) ||
            valorMaximoCampo < 0)

            throw new IllegalArgumentException();

        if (valorCampo.length() > valorMaximoCampo)
            throw new TamanhoInvalidoException();
    }
}
