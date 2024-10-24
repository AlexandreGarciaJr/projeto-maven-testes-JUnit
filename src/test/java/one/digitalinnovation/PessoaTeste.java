package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("julia", LocalDate.of(2020,1,1));
        Assertions.assertEquals(4,pessoa.getIdade());
    }
}
