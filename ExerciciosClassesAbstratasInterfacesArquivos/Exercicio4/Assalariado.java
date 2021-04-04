package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio4;

public class Assalariado extends Funcionario{
    
    public Assalariado(String nome, String CPF, int salario){
        super(nome, CPF, salario);
    }
    @Override
    public void getFolhaPagamento(){
        System.out.println(this.salario);
    }
}
