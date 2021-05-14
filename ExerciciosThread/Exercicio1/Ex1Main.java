package ExerciciosThread.Exercicio1;

import java.util.Scanner;

public class Ex1Main {
    public static int contador = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = in.nextInt();
        Thread1 thread1 = new Thread1(n/2);
        Thread2 thread2 = new Thread2(n);
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("De 0 a " + n + ", " + contador + " números são primos");
        in.close();
    }
}