package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio5;

public class main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.setContato("Leonardo", "123.456.789-74", "Rua qualquer", "29/07/1999");
        agenda.setContato("Caroline", "456.123.789-80", "Rua com nome estranho", "05/11/2001");
        agenda.setContato("Sonho&etc", "11.504.135/0001-21", "Rua sem nome", 14510);
        agenda.setContato("Padaria", "05.234.450/0001-79", "Rua sem saida", 235990);
        agenda.getContatos();
        System.out.println("============================================================");
        agenda.getContatos("456.123.789-80");
        System.out.println("============================================================");
        agenda.getContatos("05.234.450/0001-79");
    }
}
