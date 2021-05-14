package ExerciciosThread.Exercicio2;

public class CounterUser {
    public static void main(String[] args) {
        Counter c = new Counter();
        CounterThread t1 = new CounterThread("Incrementa", c);
        CounterThread t2 = new CounterThread("Decrementa", c);
    }
}
