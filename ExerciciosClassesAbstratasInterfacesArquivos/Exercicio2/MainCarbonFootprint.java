package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio2

import java.util.ArrayList;

public class MainCarbonFootprint {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> itens = new ArrayList<CarbonFootprint>();
        itens.add(new Construcao(false, 12, 2));
        itens.add(new Carro("Gasolina", 8));
        itens.add(new Bicicleta("Caloi"));
        itens.add(new Carro("Diesel", 6));
        itens.add(new Bicicleta("Scott"));
        itens.add(new Construcao(false, 16, 3, "Propano"));

        for(CarbonFootprint item : itens){
            //System.out.println(item.getClass().getTypeName());
            System.out.println("============================================");
            if(item.getClass().getTypeName() == "ExerciciosClassesAbastratasInterfacesArquivos.Exercicio2.Construcao"){
                System.out.printf("CarbonFootprint da Construção: %.2f toneladas de CO2 por kWh\n", item.getCarbonFootprint());
                item.getDados();
            }
            else if(item.getClass().getTypeName() == "ExerciciosClassesAbastratasInterfacesArquivos.Exercicio2.Carro"){
                System.out.printf("CarbonFootprint do Carro: %f toneladas de CO2 por Litro\n", item.getCarbonFootprint());
                item.getDados();
            }
            else if(item.getClass().getTypeName() == "ExerciciosClassesAbastratasInterfacesArquivos.Exercicio2.Bicicleta"){
                System.out.printf("CarbonFootprint da Bicicleta: %.1f\n", item.getCarbonFootprint());
                item.getDados();
            }
        }
    }
}