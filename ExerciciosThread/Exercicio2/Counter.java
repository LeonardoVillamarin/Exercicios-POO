package ExerciciosThread.Exercicio2;

public class Counter {
    private int count = 0;

    synchronized void increment(){
        if(count == 3){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Count já está no seu valor máximo, aguardando...");
        }
        if(count < 3){
            notify();
            count++;
            System.out.println("Ocorreu um incremento, valor de count: " + count);
        }
    }
    synchronized void decrement(){
        if(count == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Count já está no seu valor mínimo, aguardando...");
        }
        if(count > 0){
            notify();
            count--;
            System.out.println("Ocorreu um decremento, valor de count: " + count);
        }
    }
}
