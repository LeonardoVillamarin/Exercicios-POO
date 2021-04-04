package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio6;

import java.io.*;
import java.util.ArrayList;

public class Leitura {
    int dia;
    double tempMin;
    double tempMax;
    int indicePluv;
    public Leitura(int dia, double tempMin, double tempMax, int indicePluv){  
        this.dia = dia;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.indicePluv = indicePluv;
    }
    public static ArrayList<Leitura> getLeitura() throws IOException{
        ArrayList<Leitura> dados = new ArrayList<Leitura>();
        BufferedReader arquivo = null;
        arquivo = new BufferedReader(new FileReader("ExerciciosClassesAbastratasInterfacesArquivos\\Exercicio6\\Dados.txt"));
        String string;
        while((string = arquivo.readLine()) != null){
            String[] str = string.split(" ");
            dados.add(new Leitura(Integer.parseInt(str[0]), Double.parseDouble(str[1]), Double.parseDouble(str[2]), Integer.parseInt(str[3])));
        }
        arquivo.close();
        return dados;
    }
    public static void setDado(int dia, double tempMin, double tempMax, int indicePluv) throws IOException{
        BufferedReader leitura = new BufferedReader(new FileReader("ExerciciosClassesAbastratasInterfacesArquivos\\Exercicio6\\Dados.txt"));
        ArrayList<String> dados = new ArrayList<String>();
        String dadoLido;
        while((dadoLido = leitura.readLine()) != null){
            dados.add(dadoLido);
        }
        leitura.close();
        
        PrintWriter arquivo = null;
        arquivo = new PrintWriter(new FileWriter("ExerciciosClassesAbastratasInterfacesArquivos\\Exercicio6\\Dados.txt"));
        for(String dado : dados){
            arquivo.println(dado);
        }
        arquivo.printf("%s %s %s %s\n", Integer.toString(dia), Double.toString(tempMin), Double.toString(tempMax), Integer.toString(indicePluv));
        arquivo.close(); 
    }
}
