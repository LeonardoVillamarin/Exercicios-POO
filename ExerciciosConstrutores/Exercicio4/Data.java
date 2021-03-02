package ExerciciosConstrutores.Exercicio4;

public class Data {
    String data;

    Data(int dia, int mes, int ano){
        this.data = dia + "/" + mes + "/" +ano;
    }
    Data(int dia, int ano){
        this.data = dia + " " + ano;
    }
    Data(String mes, int dia, int ano){
        this.data = mes + " " + dia + ", " + ano;
    }

    void imprimeData(){
        System.out.println(data);
    }
}
