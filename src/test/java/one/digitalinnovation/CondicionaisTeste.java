package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoUsuarioAlexandre(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
