package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio7;

import ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio7.Dia.DiaDaSemana;

public class main {
   public static void main(String[] args) {
       Dia dia = new Dia(DiaDaSemana.SEXTA);
       System.out.println(dia.ehDiaUtil());
       Dia dia2 = new Dia(DiaDaSemana.TERCA);
       System.out.println(dia2.ehDiaUtil());
       Dia dia3 = new Dia(DiaDaSemana.DOMINGO);
       System.out.println(dia3.ehDiaUtil());
       Dia dia4 = new Dia(DiaDaSemana.QUINTA);
       System.out.println(dia4.ehDiaUtil());
       Dia dia5 = new Dia(DiaDaSemana.SABADO);
       System.out.println(dia5.ehDiaUtil());
   } 
}
