package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTeste {

    @Test
    void validarLancamentos(){
        int[] primeirosLancamentos = {10, 20, 30, 40, 50};
        int[] segundosLancamentos = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(primeirosLancamentos, segundosLancamentos);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.now());
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){

        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor);
    }
}
