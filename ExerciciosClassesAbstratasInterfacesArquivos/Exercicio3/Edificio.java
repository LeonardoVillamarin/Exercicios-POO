package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio3;

public abstract class Edificio implements CarbonFootprint{
    boolean energiaRenovavel;
    int qtdLamp;
    int qtdArCondicionado;
    String combustivelAquecimento;

    public Edificio(boolean energiaRenovavel, int qtdLamp, int qtdArCondicionado){
        this.energiaRenovavel = energiaRenovavel;
        this.qtdLamp = qtdLamp;
        this.qtdArCondicionado = qtdArCondicionado;
        this.combustivelAquecimento = null;
    }
    public Edificio(boolean energiaRenovavel, int qtdLamp, int qtdArCondicionado, String combustivelAquecimento){
        this.energiaRenovavel = energiaRenovavel;
        this.qtdLamp = qtdLamp;
        this.qtdArCondicionado = qtdArCondicionado;
        this.combustivelAquecimento = combustivelAquecimento;
    }
}
