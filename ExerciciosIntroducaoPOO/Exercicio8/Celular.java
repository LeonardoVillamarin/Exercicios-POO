package ExerciciosIntroducaoPOO.Exercicio8;

public class Celular {
    Bateria bateria = new Bateria();

    void ligacao(int segundos){
        bateria.cargaAtual -= segundos/5;
        System.out.println("Ligação durou "+ segundos + " segundos");
        retornaBateria();
    }
    void mensagem(){
        bateria.cargaAtual--;
        System.out.println("Você mandou 1 mensagem");
        retornaBateria();
    }
    void retornaBateria(){
        bateria.nivel = 100*bateria.cargaAtual/bateria.capacidadeCarga;
        System.out.print("Bateria em "+ bateria.nivel + " %\n");
    }
}

