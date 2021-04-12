package ExerciciosTratamentoExcecoes.Exercicio3;

public class DadoInvalidoException extends RuntimeException{
    public DadoInvalidoException (){
        super("Dado inválido");
    }
}
