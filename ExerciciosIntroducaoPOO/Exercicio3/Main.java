package ExerciciosIntroducaoPOO.Exercicio3;

public class Main {
    public static void main(String[] args) {
        Porta porta = new Porta();
        porta.aberta = true;
        porta.cor = "Vermelho";
        porta.altura = 180;
        porta.comprimento = 50;
        System.out.println("Status:"+porta.estaAberta(porta));
        System.out.println("Cor:"+porta.cor);
        System.out.println("Altura:"+porta.altura);
        System.out.println("Comprimento:"+porta.comprimento);
        porta.aberta = false;
        porta.cor = "Azul";
        porta.altura = 190;
        porta.comprimento = 60;
        System.out.println("Status:"+porta.estaAberta(porta));
        System.out.println("Cor:"+porta.cor);
        System.out.println("Altura:"+porta.altura);
        System.out.println("Comprimento:"+porta.comprimento);
    }
}
