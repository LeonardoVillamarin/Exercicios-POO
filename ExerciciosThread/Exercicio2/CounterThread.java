package ExerciciosThread.Exercicio2;

import java.util.Random;

public class CounterThread implements Runnable{
    String s;
    Counter c;

    public CounterThread(String s, Counter c){ 
        this.s = s;
        this.c = c;
        new Thread(this, s).start();
    }

    @Override
    public void run(){
        Random num = new Random();
        if(s.equals("Incrementa")){
            for(int i = 0; i < 20; i++){
                c.increment();
                try {
                    Thread.sleep(num.nextInt(501));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        else{
            for(int i = 0; i < 20; i++){
                c.decrement();
                try {
                    Thread.sleep(num.nextInt(501));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
