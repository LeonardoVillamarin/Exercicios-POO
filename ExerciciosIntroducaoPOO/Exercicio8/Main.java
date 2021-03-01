package ExerciciosIntroducaoPOO.Exercicio8;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.bateria.capacidadeCarga = 300;     
        celular.bateria.cargaAtual = 300;

        celular.ligacao(35);
        celular.mensagem();
        celular.mensagem();
        celular.mensagem();
        celular.ligacao(50);
        celular.ligacao(50);
        celular.retornaBateria();

        Celular celular2 = new Celular();
        celular2.bateria.capacidadeCarga = 100;     
        celular2.bateria.cargaAtual = 100;
        
        System.out.println("\n");
        celular2.ligacao(35);
        celular2.mensagem();
        celular2.mensagem();
        celular2.mensagem();
        celular2.ligacao(50);
        celular2.retornaBateria();
        celular2.ligacao(35);
        celular2.mensagem();
        celular2.mensagem();
        celular2.mensagem();
        celular2.ligacao(50);
        celular2.retornaBateria();
    }
}
