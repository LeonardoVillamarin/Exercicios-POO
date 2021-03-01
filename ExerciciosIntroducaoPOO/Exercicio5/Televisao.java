package ExerciciosIntroducaoPOO.Exercicio5;

/**
 * Televisao
 */
public class Televisao {
    String estado = "Desligada";
    int volume = 0;
    int canal = 0;
    void ligaDesliga(Televisao tv, String estado){
        if(estado == "ligada")
            tv.estado = "Ligada";
        else if(estado == "desligada")
            tv.estado = "Desligada";
    }
    void silencia(Televisao tv){
        tv.volume = 0;
    }
    void dessilencia(Televisao tv){
        tv.volume = 5;
    }
    void aumentaVolume(Televisao tv){
        if(tv.volume < 10)
            tv.volume++;
    }
    void diminuiVolume(Televisao tv){
        if(tv.volume > 0)
            tv.volume--;
    }
    void proximoCanal(Televisao tv){
        if(canal >=0 && canal < 99)
            canal++;
    }
    void canalAnterior(Televisao tv){
        if(canal >0 && canal < 100)
            canal--;
    }
    void mudaCanal(Televisao tv, int canal){
        if(canal >= 0 && canal < 100)
            tv.canal = canal;      
    }
}