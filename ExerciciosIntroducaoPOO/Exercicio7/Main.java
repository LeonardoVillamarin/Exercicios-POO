package ExerciciosIntroducaoPOO.Exercicio7;

public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();

        Produto arroz = new Produto();
        arroz.nome = "Arroz";
        arroz.preco = (float)4.0;
        arroz.quantidadeEstoque = 10;

        Produto feijao = new Produto();
        feijao.nome = "Feijao";
        feijao.preco = (float)5.5;
        feijao.quantidadeEstoque = 4;

        Produto queijo = new Produto();
        queijo.nome = "Queijo";
        queijo.preco = (float)7.9;
        queijo.quantidadeEstoque = 3;

        Produto carne = new Produto();
        carne.nome = "Carne";
        carne.preco = (float)16.5;
        carne.quantidadeEstoque = 9;

        caixa.escolheProduto(arroz, 4);
        caixa.escolheProduto(arroz, 4);
        caixa.escolheProduto(queijo, 4);
        caixa.escolheProduto(arroz, 3);
        caixa.escolheProduto(feijao, 4);
        caixa.escolheProduto(carne, 5);

        caixa.pagamento("Cartão");
    }
}
