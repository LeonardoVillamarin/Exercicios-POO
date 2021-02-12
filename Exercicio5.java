import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner n = new Scanner(System.in);
        int nInt = n.nextInt();
        int fatorial = 1;
        n.close();
        if(nInt > 0){
            while(nInt > 0){
                fatorial = fatorial * nInt;
                nInt--;
            }
            System.out.println(fatorial);
            //return fatorial;
        }
        else{
            System.out.println("Não foi possível calcular o fatorial.");
            //return -1;
        }
    }
}
