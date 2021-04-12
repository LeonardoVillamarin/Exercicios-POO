package ExerciciosTratamentoExcecoes.Exercicio3;

public class Cliente {
    String nome;
    String telefone;
    String CPF;
    String email;

    public Cliente(String nome, String telefone, String CPF, String email){
        if(nome == null || telefone == null || CPF == null || email == null){
            throw new DadoInvalidoException();
        }
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.telefone = telefone;
    }
    public String getCPF(){
        return this.CPF;
    }
}
