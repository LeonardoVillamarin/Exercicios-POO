import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int r,s,t;
        System.out.println("Digite o 1º número:");
        Scanner num1 = new Scanner(System.in);
        r = num1.nextInt();
        System.out.println("Digite o 2º número:");
        Scanner num2 = new Scanner(System.in);
        s = num2.nextInt();
        System.out.println("Digite o 3º número:");
        Scanner num3 = new Scanner(System.in);
        t = num3.nextInt();
        if(r > s && r > t){
            System.out.println(r);
        }
        else if(s > r && s > t){
            System.out.println(s);
        }
        else if(t > r && t > s){
            System.out.println(t);
        }   
        num1.close();
        num2.close();
        num3.close();   
    }
}
