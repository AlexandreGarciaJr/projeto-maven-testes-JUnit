package one.digitalinnovation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa2 {
    private String nome;

    private LocalDateTime nascimento;

    public Pessoa2(String nome, LocalDateTime nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getIdade(){

        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDateTime.now());
    }

    public boolean eMaiorDeIdade(){
        return getIdade() >=18;
    }
}
