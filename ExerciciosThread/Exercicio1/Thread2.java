package ExerciciosThread.Exercicio1;

public class Thread2 extends Thread{
    int n;
    public Thread2(int n){
        this.n = n;
        start();
    }
    public void run(){
        for(int i = n/2; i <= n; i++){
            int cont = 0;
            for(int j = 2; j <= n; j++){
                if(i % j == 0){
                    cont++;
                }
            }
            if(cont == 1){
                System.out.println(i);
                Ex1Main.contador++;
            }
        }
    }
}
