package ExerciciosConstrutores.Exercicio4;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(2, 8, 2019);
        Data data2 = new Data(10, 5, 2020);
        Data data3 = new Data("Agosto", 2, 2019);
        Data data4 = new Data("Junho", 15, 2020);
        Data data5 = new Data(200, 2019);
        Data data6 = new Data(320, 2020);

        data.imprimeData();
        data2.imprimeData();
        data3.imprimeData();
        data4.imprimeData();
        data5.imprimeData();
        data6.imprimeData();
    }
}
