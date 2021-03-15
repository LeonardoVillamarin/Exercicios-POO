package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio2;

public class CampoFutebol {
    private static int AreaCampo = 8250;

    public static void getPesQuadrados(){
        System.out.printf("Pés Quadrados: %.0f\n", ConversaoDeUnidadesDeArea.getPesQuadradosDeMetroQuadrado(AreaCampo));
    }
    public static void getAcres(){
        System.out.printf("Acres: %.3f\n", ConversaoDeUnidadesDeArea.getAcresDePesQuadrados(ConversaoDeUnidadesDeArea.getPesQuadradosDeMetroQuadrado(AreaCampo)));
    }
    public static void getCmQuadrados(){
        System.out.printf("Centímetros Quadrados: %.0f", ConversaoDeUnidadesDeArea.getCmQuadradosDePeQuadrado(ConversaoDeUnidadesDeArea.getPesQuadradosDeMetroQuadrado(AreaCampo)));
    }
}
