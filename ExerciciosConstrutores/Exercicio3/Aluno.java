package ExerciciosConstrutores.Exercicio3;

public class Aluno {
    private String nome;
    private float nota;
    private float CR;
    Turma[] materiasCursadas;

    Aluno(String nome){  //Nota, CR, Materias cursadas são adicionadas conforme o aluno estuda, e não na sua criação
        this.nome = nome;
    }
    public void getHistorico(){

    }
    public void calculaCR(){

    }
    public void setNota(float nota){
        this.nota = nota;
    }
    public float getNota(){
        return this.nota;
    }
}
