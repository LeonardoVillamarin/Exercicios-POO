package ExerciciosIntroducaoPOO.Exercicio2;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        System.out.println("Nome:"+pessoa.nome);
        System.out.println("Idade:"+pessoa.idade);
        System.out.println("Nome:"+pessoa.nome);
        pessoa.aniversario(pessoa);
        System.out.println("Idade:"+pessoa.idade);
        pessoa.aniversario(pessoa);
        System.out.println("Idade:"+pessoa.idade);
        pessoa.aniversario(pessoa);
        System.out.println("Idade:"+pessoa.idade);
    }
}
