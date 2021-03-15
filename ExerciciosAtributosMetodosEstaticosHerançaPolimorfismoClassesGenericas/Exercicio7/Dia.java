package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio7;

public class Dia{
    public enum DiaDaSemana {
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO;
    }
    private DiaDaSemana dia;
    
    public Dia(DiaDaSemana dia){
        this.dia = dia;
    } 
    public boolean ehDiaUtil(){
        if(this.dia != DiaDaSemana.SABADO && this.dia != DiaDaSemana.DOMINGO){
            return true;                
        }
        else{
            return false;
        }
    }
}