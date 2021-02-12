import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int nota;
        int pessima = 0, ruim = 0, boa = 0, otima = 0;
        System.out.println("Digite um nota:");
        Scanner num = new Scanner(System.in);
        nota = num.nextInt();
        while(nota >= 0 && nota <= 100){
            if (nota <= 25)
                pessima++;
            else if(nota > 25 && nota <= 50)
                ruim++;
            else if(nota > 50 && nota <= 75)
                boa++;
            else if(nota > 75)
                otima++;
            System.out.println("Digite um nota:");
            Scanner num2 = new Scanner(System.in);
            nota = num2.nextInt();
        }
        float total = pessima + ruim + boa + otima;
        System.out.println("Péssima: "+ ((float)pessima/total)*100 + "% Ruim: " + ((float)ruim/total)*100 + "% Boa: " + ((float)boa/total)*100 + "% Ótima: " + ((float)otima/total)*100 + "%");
        num.close();
    }
}
