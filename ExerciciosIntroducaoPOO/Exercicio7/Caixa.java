package ExerciciosIntroducaoPOO.Exercicio7;

public class Caixa {
    Pedido pedido = new Pedido();

    void escolheProduto(Produto produto, int quantidade){
        pedido.itens[pedido.quantidadeTotal] = new Item();
        if(produto.quantidadeEstoque >= quantidade){
            pedido.itens[pedido.quantidadeTotal].quantidade = quantidade;
            produto.quantidadeEstoque -= quantidade;
            System.out.println("Foi adicionado "+ quantidade + " unidades de "+produto.nome+" no pedido");
        }
        else if(produto.quantidadeEstoque < quantidade){
            System.out.println("Foi adicionado "+produto.quantidadeEstoque + " unidades restantes disponíveis no estoque de "+ produto.nome+ " no pedido");
            pedido.itens[pedido.quantidadeTotal].quantidade = produto.quantidadeEstoque;
            produto.quantidadeEstoque -= produto.quantidadeEstoque;
        }
        else if(produto.quantidadeEstoque == 0){
            System.out.println("Não tem unidades disponíveis de "+ produto.nome);
        }
        pedido.itens[pedido.quantidadeTotal].produto = produto;
        pedido.quantidadeTotal++;
    }
    void valorTotal(){
        for(int i = 0; i < pedido.quantidadeTotal; i++){
            pedido.valorTotal += (float)pedido.itens[i].quantidade * pedido.itens[i].produto.preco;   
        }
        System.out.println("O total foi: "+pedido.valorTotal); 
    }
   
    void pagamento(String metodo){
        valorTotal();
        pedido.metodoPag = metodo;
        System.out.println("Pagamento efetuado com: "+pedido.metodoPag);
    }  
}
