package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio8;

public class Par<F, S> {
    private F primeiro;
    private S segundo;

    public void setPar(F item, S item2){
        this.primeiro = item;
        this.segundo = item2;
    } 
    public F getPrimeiroPar(){
        return primeiro;
    }
    public S getSegundoPar(){
        return segundo;
    }
}
