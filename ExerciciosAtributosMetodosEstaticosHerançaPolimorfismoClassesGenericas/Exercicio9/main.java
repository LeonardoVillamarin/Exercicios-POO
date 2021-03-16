package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio9;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.calculaArea(3);
        Retangulo retangulo = new Retangulo();
        retangulo.calculaArea(2, 5);
        Triangulo triangulo = new Triangulo();
        triangulo.calculaArea(3, 9);
        Circulo circulo = new Circulo();
        circulo.calculaArea(4);
        FormaGeometrica figuras[] = {quadrado, retangulo, circulo, triangulo};
        
        System.out.println(Soma.somaArea(figuras));
    }
}
