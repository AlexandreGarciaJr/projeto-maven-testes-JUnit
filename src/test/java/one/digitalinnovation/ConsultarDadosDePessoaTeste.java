package one.digitalinnovation;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTeste {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Iniciou Conexao");
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Jorge", LocalDate.of(2000, 11, 1)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("Jorge", LocalDate.of(2000, 11, 1)));
    }


    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("Finalizou Conexao");
    }

}
