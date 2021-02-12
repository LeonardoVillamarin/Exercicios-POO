import java.util.Scanner;

public class Exercicio1{    
    public static void main(String[] args) {
        System.out.println("Digite o n:");
        Scanner n = new Scanner(System.in);
        int nInt = n.nextInt();
        int[] numeros = new int[100];
        int num;

        for (int i = 0; i < nInt; i++){
            System.out.println("Digite um número:");
            Scanner numero = new Scanner(System.in);
            num = numero.nextInt();
            numeros[i] = num;
            if(i == nInt - 1){
                numero.close();
            }
        }

        for (int i = 0; i < nInt; i++){
            if (numeros[i] < 0)
                System.out.println(numeros[i]);
        }
    n.close();
    }
}