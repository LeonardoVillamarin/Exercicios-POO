package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio5;

public class ItemVenda implements Recebivel{
    String produto;
    int quantidade;
    double precoUnitario;

    public ItemVenda(String produto, int quantidade, double precoUnitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    @Override
    public double totalizarReceita(){
        return this.quantidade * this.precoUnitario;
    } 
}
