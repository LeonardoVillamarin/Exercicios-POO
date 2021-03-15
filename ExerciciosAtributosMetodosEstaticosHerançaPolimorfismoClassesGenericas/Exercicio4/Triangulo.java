package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio4;

public class Triangulo extends Figura {
    int lado;

    public Triangulo(int lado){
        super("Triângulo Equilátero");
        this.lado = lado;   
    }

    @Override
    public void getArea(){
        this.area = (float)(Math.sqrt(3)/4)*(lado*lado);
        System.out.printf("Área do %s: %.2f\n", this.nome, this.area);
    }
}
