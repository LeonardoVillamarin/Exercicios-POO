package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio5;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
    
    public void setContato(String nome, String CPF, String Endereco, String dataNascimento){
        agenda.add(new PessoaFisica(nome, CPF, Endereco, dataNascimento));
    }
    public void setContato(String nomeRazao, String CNPJ, String Endereco, int faturamento){
        agenda.add(new PessoaJuridica(nomeRazao, CNPJ, Endereco, faturamento));
    }
    public void getContatos(){
        for(Pessoa pessoa:agenda){
            System.out.printf("%d. ", agenda.indexOf(pessoa)+1);
            pessoa.getContato();
        }
    }
    public void getContatos(String documento){
        for(Pessoa pessoa:agenda){
            if(pessoa.getDocumento() == documento){
                System.out.printf("%d. ", agenda.indexOf(pessoa)+1);
                pessoa.getContato();
            }
        }
    }
}
