package ExerciciosIntroducaoPOO.Exercicio7;

public class Estoque {
    Produto[] produtos = new Produto[100];
    int totalProdutos = 0;

    void addProduto(Produto produto){
        produtos[totalProdutos] = produto;
        totalProdutos++;
    }
}
