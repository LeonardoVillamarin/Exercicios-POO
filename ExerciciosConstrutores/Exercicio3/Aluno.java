package ExerciciosConstrutores.Exercicio3;

public class Aluno {
    private String nome;
    private float nota;

    Aluno(String nome){
        this.nome = nome;
    }
    public void setNota(float nota){
        this.nota = nota;
    }
    public float getNota(){
        return this.nota;
    }
}
