package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio9;

public class Soma {
    public static <T extends FormaGeometrica> float somaArea(T array[]){
        float soma = 0;
        for(T item:array){
            soma += item.getArea();
        }
        return soma;
    }
}
