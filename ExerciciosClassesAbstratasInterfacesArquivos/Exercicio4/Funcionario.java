package ExerciciosClassesAbastratasInterfacesArquivos.Exercicio4;

public abstract class Funcionario {
    String nome;
    String CPF;
    float salario;
    
    public Funcionario(String nome, String CPF, float salario){
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }
    public Funcionario(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }
    public void getFolhaPagamento(){
    }
    public void getFolhaPagamento(int valor){
    }
}
