package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio4;

public class Circulo extends Figura{
    int diametro;

    public Circulo(int diametro){
        super("Círculo");
        this.diametro = diametro;    
    }

    @Override
    public void getArea(){
        this.area = (float)(((diametro/2)*(diametro/2))*Math.PI);
        System.out.printf("Área do %s: %.2f\n", this.nome, this.area);
    }
}
