package one.digitalinnovation;

public class TransferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta contaDestno, int valor){
        if (valor <= 0){
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
    }
}
