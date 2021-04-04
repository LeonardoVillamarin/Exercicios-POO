package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio4;

public class Comissionado extends Funcionario{
    float porcentagem;
    public Comissionado(String nome, String CPF, float porcentagem){
        super(nome, CPF);
        this.porcentagem = porcentagem;
    }
    @Override
    public void getFolhaPagamento(int valorVendas){
        System.out.println(valorVendas * porcentagem/100);
    }
}