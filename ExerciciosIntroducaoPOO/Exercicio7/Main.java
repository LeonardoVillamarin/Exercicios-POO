package ExerciciosIntroducaoPOO.Exercicio7;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Produto arroz = new Produto();
        arroz.nome = "Arroz";
        arroz.preco = (float)4.0;
        arroz.quantidadeEstoque = 10;
        estoque.addProduto(arroz);

        Produto feijao = new Produto();
        feijao.nome = "Feijao";
        feijao.preco = (float)5.5;
        feijao.quantidadeEstoque = 4;
        estoque.addProduto(feijao);

        Produto queijo = new Produto();
        queijo.nome = "Queijo";
        queijo.preco = (float)7.9;
        queijo.quantidadeEstoque = 3;
        estoque.addProduto(queijo);

        Produto carne = new Produto();
        carne.nome = "Carne";
        carne.preco = (float)16.5;
        carne.quantidadeEstoque = 9;
        estoque.addProduto(carne);

        Pedido pedido = new Pedido();

        pedido.escolheProduto("Arroz", 4);
        pedido.escolheProduto("Arroz", 4);
        pedido.escolheProduto("Arroz", 4);
        pedido.escolheProduto("Feijao", 4);
        pedido.escolheProduto("Carne", 4);

        pedido.pagamento("Cartão");

    }
}
