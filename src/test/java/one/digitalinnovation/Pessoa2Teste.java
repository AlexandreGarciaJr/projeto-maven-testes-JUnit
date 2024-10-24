package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pessoa2Teste {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa2 jessica = new Pessoa2("Jessica", LocalDateTime.of(2000, 1,1, 15,0,0));
        Assertions.assertEquals(24, jessica.getIdade());
    }

    @Test
    void deveSerMaiorDeIdade(){
        Pessoa2 jessica = new Pessoa2("Jessica", LocalDateTime.of(2000, 1,1, 15,0,0));
        Assertions.assertTrue(jessica.eMaiorDeIdade());

        Pessoa2 joao = new Pessoa2("Joao",LocalDateTime.now());
        Assertions.assertFalse(joao.eMaiorDeIdade());
    }
}
