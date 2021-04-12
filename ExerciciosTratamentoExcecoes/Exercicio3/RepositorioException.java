package ExerciciosTratamentoExcecoes.Exercicio3;

public class RepositorioException extends RuntimeException{
    public RepositorioException(){
        super("Não é possível inserir mais clientes");
    }
}
