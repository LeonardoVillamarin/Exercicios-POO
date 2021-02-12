public class Exercicio6 {
    public static void main(String[] args) {
        int fibonacci = 0;
        int aux = 0;
        int aux2 = 1;
        do{
            if (fibonacci == 0){
                System.out.println(fibonacci);
                fibonacci = aux2;
                System.out.println(fibonacci);
            }
            fibonacci = aux + aux2;
            aux = aux2;
            aux2 = fibonacci;
            System.out.println(fibonacci);
        }while(fibonacci < 100);
    }
}
