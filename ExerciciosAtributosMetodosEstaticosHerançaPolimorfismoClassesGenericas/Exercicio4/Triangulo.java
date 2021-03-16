package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio4;

public class Triangulo extends Figura {
    int base;
    int altura;

    public Triangulo(int base, int altura){
        super("Triângulo Equilátero");
        this.base = base;
        this.altura = altura; 
    }

    @Override
    public void getArea(){
        this.area = (float)(base*altura)/2;
        System.out.printf("Área do %s: %.2f\n", this.nome, this.area);
    }
}
