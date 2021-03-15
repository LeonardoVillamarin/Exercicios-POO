package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio4;

public class Retangulo extends Figura {
    int base;
    int altura;

    public Retangulo(int base, int altura){
        super("Retângulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void getArea(){
        this.area = base * altura;
        System.out.printf("Área do %s: %.2f\n",this.nome, this.area);
    }
}