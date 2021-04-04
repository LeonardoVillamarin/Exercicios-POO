package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio3;

import java.util.ArrayList;

public class MainCarbonFootprint {
    public static void main(String[] args) {
        //Resposta da a - Não, porque como a classe Edifico é abstract, não da para instanciá-la
        ArrayList<CarbonFootprint> itens = new ArrayList<CarbonFootprint>();
        itens.add(new Casa(false, 12, 2));
        itens.add(new Carro("Gasolina", 8));
        itens.add(new Bicicleta("Caloi"));
        itens.add(new Carro("Diesel", 6));
        itens.add(new Bicicleta("Scott"));
        itens.add(new Escola(false, 16, 6, "Propano"));

        for(CarbonFootprint item : itens){
            System.out.println("============================================");
            if(item.getClass().getTypeName() == "ExerciciosClassesAbastratasInterfacesArquivos.Exercicio3.Escola"){
                System.out.printf("CarbonFootprint da Escola: %.2f toneladas de CO2 por kWh\n", item.getCarbonFootprint());
                item.getDados();
            }
            else if(item.getClass().getTypeName() == "ExerciciosClassesAbastratasInterfacesArquivos.Exercicio3.Casa"){
                System.out.printf("CarbonFootprint da Casa: %.2f toneladas de CO2 por kWh\n", item.getCarbonFootprint());
                item.getDados();
            }
            else if(item.getClass().getTypeName() == "ExerciciosClassesAbastratasInterfacesArquivos.Exercicio3.Carro"){
                System.out.printf("CarbonFootprint do Carro: %f toneladas de CO2 por Litro\n", item.getCarbonFootprint());
                item.getDados();
            }
            else if(item.getClass().getTypeName() == "ExerciciosClassesAbastratasInterfacesArquivos.Exercicio3.Bicicleta"){
                System.out.printf("CarbonFootprint da Bicicleta: %.1f\n", item.getCarbonFootprint());
                item.getDados();
            }
        }
    }
}