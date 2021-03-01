package ExerciciosIntroducaoPOO.Exercicio7;

public class Pedido {
    Item[] itens = new Item[100];
    Estoque estoque = new Estoque();
    float valorTotal = 0;
    int quantidadeTotal = 0;
    String metodoPag;

    void escolheProduto(String nome, int quantidade){
        for(int i = 0; i < estoque.totalProdutos; i++){
            if(estoque.produtos[i].nome == nome){
                if(estoque.produtos[i].quantidadeEstoque > quantidade){
                    itens[quantidadeTotal].produto = estoque.produtos[i];
                    itens[quantidadeTotal].quantidade = quantidade;
                    estoque.produtos[i].quantidadeEstoque -= quantidade;
                }
                if(estoque.produtos[i].quantidadeEstoque < quantidade){
                    System.out.println("Tem apenas "+ estoque.produtos[i].quantidadeEstoque + " unidades desse produto");
                    itens[quantidadeTotal].quantidade = estoque.produtos[i].quantidadeEstoque;
                    estoque.produtos[i].quantidadeEstoque -= estoque.produtos[i].quantidadeEstoque; 
                } 
            }   
        }
        if(itens[quantidadeTotal].produto.nome != nome){
            System.out.println("Esse produto não está disponível");
        }
        if(itens[quantidadeTotal].produto.nome == nome){
            quantidadeTotal++;
        }
    }
    float valorTotal(){
        valorTotal += itens[quantidadeTotal].quantidade * itens[quantidadeTotal].produto.preco;
        return valorTotal; 
    }
    void pagamento(String metodo){
        float valor = valorTotal();
        System.out.println("O total foi: "+valor);
    }
}
