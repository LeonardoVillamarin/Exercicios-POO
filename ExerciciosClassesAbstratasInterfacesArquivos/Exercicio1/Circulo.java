package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio1;

public class Circulo extends FormaGeometrica{
    public void calculaArea(int raio){
        this.area = (float)Math.PI * (raio*raio);
    }
    public void calculaPerimetro(int raio){
        this.perimetro = ((float)Math.PI * 2) * raio;
    }
}
