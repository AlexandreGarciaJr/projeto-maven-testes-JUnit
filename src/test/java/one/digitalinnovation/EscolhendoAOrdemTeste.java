package one.digitalinnovation;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class EscolhendoAOrdemTeste {

    @Order(3)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(4)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
