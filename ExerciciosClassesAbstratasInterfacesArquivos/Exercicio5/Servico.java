package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio5;

public class Servico implements Recebivel{
    String descricao;
    int horas;
    double precoHora;

    public Servico(String descricao, int horas, double precoHora){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }
    @Override
    public double totalizarReceita(){
        return this.precoHora * this.horas;
    }
}
