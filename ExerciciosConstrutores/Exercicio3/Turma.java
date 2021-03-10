package ExerciciosConstrutores.Exercicio3;

public class Turma {
    private String nome;
    private Aluno[] alunos;
    private Professor professor;
    private int quantidadeAlunos;

    Turma(String nome, Professor professor){    //Alunos são adicionados apenas após criação da turma, consequentemente a quantidade cresce junto com a adição de alunos
        this.nome = nome;
        this.professor = professor;
    }
    void String getHorario(){

    }
}
