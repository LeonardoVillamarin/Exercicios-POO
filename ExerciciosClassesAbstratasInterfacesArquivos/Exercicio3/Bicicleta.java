package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio3;

public class Bicicleta implements CarbonFootprint{
    String marca;
    public Bicicleta(String marca){
        this.marca = marca;
    }
    @Override
    public void getDados() {
        System.out.println("Marca da Bicicleta: " + marca);
    }
    @Override
    public float getCarbonFootprint(){
        return 0;
    }
}
