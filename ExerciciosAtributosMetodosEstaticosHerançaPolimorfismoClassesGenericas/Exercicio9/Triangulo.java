package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio9;

public class Triangulo extends FormaGeometrica {
    public void calculaArea(int base, int altura){
        this.area = (float)(base*altura)/2;
    }
    public void calculaPerimetro(int lado1, int lado2, int lado3){
        this.perimetro = lado1 + lado2 + lado3;
    }
}
