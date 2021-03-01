package ExerciciosIntroducaoPOO.Exercicio4;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.cor = "Verde";
        casa.porta.aberta = true;
        casa.porta.cor = "Vermelho";
        casa.porta.altura = 180;
        casa.porta.comprimento = 60;

        System.out.println("Cor da casa:"+casa.cor);
        System.out.println("Cor da porta:"+casa.porta.cor);
        System.out.println("Altura:"+casa.porta.altura);
        System.out.println("Comprimento:"+casa.porta.comprimento);

        casa.porta2.aberta = true;
        casa.porta2.cor = "Marrom";
        casa.porta2.altura = 200;
        casa.porta2.comprimento = 50;
        System.out.println("Cor da porta:"+casa.porta2.cor);
        System.out.println("Altura:"+casa.porta2.altura);
        System.out.println("Comprimento:"+casa.porta2.comprimento);

        casa.porta3.aberta = false;
        casa.porta3.cor = "Branco";
        casa.porta3.altura = 180;
        casa.porta3.comprimento = 80;
        System.out.println("Cor da porta:"+casa.porta3.cor);
        System.out.println("Altura:"+casa.porta3.altura);
        System.out.println("Comprimento:"+casa.porta3.comprimento);

        System.out.println("Portas abertas:"+casa.quantasPortasEstaoAbertas(casa.porta, casa.porta2, casa.porta3)); 
    }
}
