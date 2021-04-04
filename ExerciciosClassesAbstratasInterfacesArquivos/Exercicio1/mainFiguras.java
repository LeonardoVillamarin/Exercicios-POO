package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio1;

public class mainFiguras {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.calculaArea(3);
        quadrado.calculaPerimetro(3);
        Retangulo retangulo = new Retangulo();
        retangulo.calculaArea(2, 5);
        retangulo.calculaPerimetro(2, 5);
        Triangulo triangulo = new Triangulo();
        triangulo.calculaArea(3, 9);
        triangulo.calculaPerimetro(3, 4, 5);
        Circulo circulo = new Circulo();
        circulo.calculaArea(4);
        circulo.calculaPerimetro(4);
        FormaGeometrica figuras[] = {quadrado, retangulo, circulo, triangulo};
        
        for(FormaGeometrica figura : figuras){
            System.out.println(figura.getArea());
            System.out.println(figura.getPerimetro());
        }
    }
}
