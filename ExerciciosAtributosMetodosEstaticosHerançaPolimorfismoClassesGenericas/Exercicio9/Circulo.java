package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio9;

public class Circulo extends FormaGeometrica{
    public void calculaArea(int raio){
        this.area = (float)Math.PI * (raio*raio);
    }
}
