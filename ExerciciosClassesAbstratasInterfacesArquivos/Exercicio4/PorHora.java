package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio4;

public class PorHora extends Funcionario{
    float salarioPorHora;
    public PorHora(String nome, String CPF, float salario, float salarioPorHora){
        super(nome, CPF, salario);
        this.salarioPorHora = salarioPorHora;
    }
    @Override
    public void getFolhaPagamento(int horasExtra){
        System.out.println(this.salario + this.salarioPorHora * horasExtra);
    }
}
