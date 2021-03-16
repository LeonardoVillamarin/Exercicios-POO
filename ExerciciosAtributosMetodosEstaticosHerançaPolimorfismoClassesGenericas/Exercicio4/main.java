package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio4;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(new Quadrado(3));
        figuras.add(new Retangulo(2, 5));
        figuras.add(new Triangulo(3, 4));
        figuras.add(new Circulo(10));
        figuras.add(new Quadrado(5));
        figuras.add(new Retangulo(3, 8));
        figuras.add(new Triangulo(3, 6));
        figuras.add(new Circulo(5));

        for(Figura figura: figuras){
            figura.getArea();
        }
    }
}
