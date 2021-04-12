package ExerciciosTratamentoExcecoes.Exercicio3;

public class ClienteInexistenteException extends RuntimeException{
    public ClienteInexistenteException(){
        super("Este cliente não está cadastrado");
    }
}
