package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio4;

public class ComissionadoAssalariado extends Funcionario{
    float porcentagem;
    public ComissionadoAssalariado(String nome, String CPF, float salario, float porcentagem){
        super(nome, CPF, salario);
        this.porcentagem = porcentagem;
    }
    @Override
    public void getFolhaPagamento(int valorVendas){
        System.out.println((this.salario + this.salario * 0.1f) + (valorVendas * porcentagem/100));
    }
}
