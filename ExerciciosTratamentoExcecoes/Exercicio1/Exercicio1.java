package ExerciciosTratamentoExcecoes.Exercicio1;

//IllegalArgumentException = Inidica que foi passado para o método um argumento proibido ou inapropriado. 
//NumberFormatException =  indica que a aplicação tentou converter uma string para um tipo numérico, porém esta string não tem o formato apropriado.

public class Exercicio1 {
    public static void testaExcecao(String x, String y){
        try{
        Integer.parseInt(x);
        }catch(NumberFormatException e){
            System.out.println("Não foi possível converter a String");
        }
        if(y == null){
            throw new IllegalArgumentException("Argumento inválido");
        }
    }
    public static void main(String[] args) {
        try{
            Exercicio1.testaExcecao("3,0", null);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
