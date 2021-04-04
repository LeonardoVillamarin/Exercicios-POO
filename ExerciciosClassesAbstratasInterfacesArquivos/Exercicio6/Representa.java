package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio6;

import java.io.IOException;
import java.util.ArrayList;

public class Representa {
    public static void getRepresentacao() throws IOException{
        ArrayList<Leitura> dados = Leitura.getLeitura();
        System.out.println("=====================================================");
        for(Leitura dado : dados){
            System.out.println("Dia: " + dado.dia);
            System.out.println("Temperatura Máxima: " + dado.tempMin);
            System.out.println("Temperatura Mínima: " + dado.tempMax);
            System.out.println("Índice Pluviométrico: " + dado.indicePluv); 
        }
        System.out.println("=====================================================");
    } 
    public static void main(String[] args) throws IOException {
        Representa.getRepresentacao();
        Leitura.setDado(30, 20.32, 25.46, 13);
        Representa.getRepresentacao();
    }   
}
