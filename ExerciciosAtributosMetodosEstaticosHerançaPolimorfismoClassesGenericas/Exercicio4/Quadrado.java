package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio4;

public class Quadrado extends Figura {
    int lado;

    public Quadrado(int lado){
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    public void getArea(){
        this.area = lado * lado;
        System.out.printf("Área do %s: %.2f\n", this.nome, this.area);
    }
}
