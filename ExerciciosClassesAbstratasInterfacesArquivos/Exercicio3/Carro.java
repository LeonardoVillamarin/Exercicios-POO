package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio3;

public class Carro implements CarbonFootprint{
    String combustivel;
    float kmPorLitro;

    public Carro(String combustivel, float kmPorLitro){
        this.combustivel = combustivel;
        this.kmPorLitro = kmPorLitro;
    }

    @Override
    public void getDados() {
        System.out.printf("Combustível Utilizado: %s\nConsumo por Km: %.2f\n", this.combustivel, this.kmPorLitro);
    }
    public float getCarbonFootprint(){
        if(this.combustivel == "Gasolina"){
            return (1 * 0.82f * 0.75f * 3.7f)/1000;
        }
        else if(this.combustivel == "Diesel"){
            return (1 * 0.83f * 3.7f)/1000;
        }
        else if(this.combustivel == "GNV"){
            return (1 * 0.574f)/1000;
        }
        else{
            return 0;
        }
    }
}
