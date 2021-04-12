package ExerciciosTratamentoExcecoes.Exercicio3;

public class ClienteJaExistenteException extends RuntimeException {
    public ClienteJaExistenteException(){
        super("Cliente já está cadastrado");
    }
}
