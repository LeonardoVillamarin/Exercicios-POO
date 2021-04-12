package ExerciciosTratamentoExcecoes.Exercicio2;

public class ContaCorrente {
    float limite;
    float saldo;
    float valorLimite;

    public void sacar(float valor){
        if(this.saldo < valor){
            throw new IllegalArgumentException("Não possui esse valor disponível para saque");
        }
        if(valor <= 0){
            throw new IllegalArgumentException("Valor de saque inválido");
        }
    } 
    public void depositar(float valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor de depósito inválido");
        }
    }
    public void setValorLimite(float valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor de limite inválido");
        }
    }
}
