package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio5;

import java.util.*;

public class RegistroRecebimentos {
    public static void main(String[] args) {
        ArrayList<Recebivel> registros = new ArrayList<Recebivel>();
        Scanner in = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("==================================");
            System.out.println("O que deseja fazer ?");
            System.out.println("1. Venda de item");
            System.out.println("2. Serviço");
            System.out.println("3. Lista dos registros");
            System.out.println("==================================");
            opcao = Integer.parseInt(in.nextLine());
            if(opcao == 1){
                System.out.println("Digite o nome do produto:");
                String produto = in.nextLine();
                System.out.println("Digite a quantidade:");
                int quantidade = Integer.parseInt(in.nextLine());
                System.out.println("Digite o preço unitário:");
                double precoUnitario = Double.parseDouble(in.nextLine());
                registros.add(new ItemVenda(produto, quantidade, precoUnitario));
            }
            else if(opcao == 2){
                System.out.println("Digite o nome do serviço:");
                String produto = in.nextLine();
                System.out.println("Digite as horas necessárias:");
                int quantidade = Integer.parseInt(in.nextLine());
                System.out.println("Digite o preço por hora:");
                double precoUnitario = Double.parseDouble(in.nextLine());
                registros.add(new ItemVenda(produto, quantidade, precoUnitario));
            }
            else if(opcao == 3){
                if(registros.size() > 0){
                    System.out.println("Registros: ");
                    for(Recebivel registro : registros){
                        System.out.println((registros.indexOf(registro)+1)+". " + registro.totalizarReceita());
                    }
                }
            }
        }while(opcao == 1 | opcao == 2 | opcao == 3);
        in.close();
    }    
}
