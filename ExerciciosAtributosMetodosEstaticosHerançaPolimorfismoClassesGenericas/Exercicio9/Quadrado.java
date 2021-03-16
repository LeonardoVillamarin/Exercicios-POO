package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio9;

public class Quadrado extends Retangulo {
    public void calculaArea(int lado){
        this.area = lado*lado;
    }
    public void calculaPerimetro(int lado){
        this.perimetro = lado*4;
    }
}
