package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio9;

public class Retangulo extends FormaGeometrica {
    public void calculaArea(int lado1, int lado2){
        this.area = lado1 * lado2;
    }
    public void calculaPerimetro(int lado1, int lado2){
        this.perimetro = (lado1 * 2) + (lado2 * 2);
    }
}