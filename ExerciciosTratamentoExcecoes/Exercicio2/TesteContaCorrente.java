package ExerciciosTratamentoExcecoes.Exercicio2;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        try{
        conta.depositar(-12);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            conta.sacar(25);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            conta.sacar(-250);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            conta.setValorLimite(-36);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }   
}
