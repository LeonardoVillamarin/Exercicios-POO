package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio2;

public class ConversaoDeUnidadesDeArea {
    public static float getPesQuadradosDeMetroQuadrado(int valor){
        return (float)valor*10.76F;
    }
    public static float getCmQuadradosDePeQuadrado(float valor){
        return valor*929;
    }
    public static float getAcresDeMilhaQuadrada(float valor){
        return valor*640;
    }
    public static float getPesQuadradosDeAcre(float valor){
        return valor*43560;
    }
    public static float getAcresDePesQuadrados(float valor){
        return valor/43560;
    }
}