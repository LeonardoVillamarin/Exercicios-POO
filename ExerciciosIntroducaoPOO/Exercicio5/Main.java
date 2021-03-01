package ExerciciosIntroducaoPOO.Exercicio5;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.ligaDesliga(tv, "ligada");
        System.out.println("TV "+tv.estado);
        tv.proximoCanal(tv);
        System.out.println("Canal: "+tv.canal);
        tv.proximoCanal(tv);
        System.out.println("Canal: "+tv.canal);
        tv.canalAnterior(tv);
        System.out.println("Canal: "+tv.canal);
        tv.aumentaVolume(tv);
        System.out.println("Volume: "+tv.volume);
        tv.aumentaVolume(tv);
        System.out.println("Volume: "+tv.volume);
        tv.silencia(tv);
        System.out.println("Volume: "+tv.volume);
        tv.dessilencia(tv);
        System.out.println("Volume: "+tv.volume);
        tv.diminuiVolume(tv);
        System.out.println("Volume: "+tv.volume);
        tv.mudaCanal(tv, 62);
        System.out.println("Canal: "+tv.canal);

        System.out.println("\nTV "+tv.estado);
        System.out.println("Canal: "+tv.canal);
        System.out.println("Volume: "+tv.volume);

    }
}
