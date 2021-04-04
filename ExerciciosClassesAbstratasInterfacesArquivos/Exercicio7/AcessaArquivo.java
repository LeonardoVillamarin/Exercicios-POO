package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio7;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class AcessaArquivo{
    public static void getFuncionario(){
        InputStream file = null; 
        try{
            file = new FileInputStream("ExerciciosClassesAbastratasInterfacesArquivos\\Exercicio7\\BinaryFile.dat");
            ObjectInputStream dado = new ObjectInputStream(file);
            Funcionario f = null;
            try {
                int i = 1;
                while((f = (Funcionario)dado.readObject()) != null){
                    System.out.println("==========================================================");
                    System.out.println(i + ".");
                    System.out.println("Número de registro: " + f.numRegistro);
                    System.out.println("Nome: " + f.nome);
                    System.out.println("Número do departamento: " + f.numDep); 
                    System.out.println("Número do departamento gerenciado: " + f.numDepGerenciado);
                    i++;
                }
                dado.close();
                file.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }catch(IOException e){
        }
    }
    public static void getFuncionario(int numRegistro){
        InputStream file = null; 
        try{
            file = new FileInputStream("ExerciciosClassesAbastratasInterfacesArquivos\\Exercicio7\\BinaryFile.dat");
            ObjectInputStream dado = new ObjectInputStream(file);
            Funcionario f = null;
            try {
                int i = 1;
                while((f = (Funcionario)dado.readObject()) != null){
                    if(f.numRegistro == numRegistro){
                        System.out.println("--------------------------------------------------------------");
                        System.out.println(i + ".");
                        System.out.println("Número de registro: " + f.numRegistro);
                        System.out.println("Nome: " + f.nome);
                        System.out.println("Número do departamento: " + f.numDep); 
                        System.out.println("Número do departamento gerenciado: " + f.numDepGerenciado);
                        i++;
                    }
                }
                dado.close();
                file.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }catch(IOException e){
        }
    }
    public static void setFuncionario(Funcionario f){
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        try{
            InputStream file = null;
            file = new FileInputStream("ExerciciosClassesAbastratasInterfacesArquivos\\Exercicio7\\BinaryFile.dat");
            ObjectInputStream dado = new ObjectInputStream(file);
            Funcionario g = null;
            try {
                while((g = (Funcionario)dado.readObject()) != null){
                    funcionarios.add(g);
                }
                dado.close();
                file.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }catch(IOException e){
        }
        try{
            FileOutputStream file = new FileOutputStream("ExerciciosClassesAbastratasInterfacesArquivos\\Exercicio7\\BinaryFile.dat");
            ObjectOutputStream dado = new ObjectOutputStream(file);
            for(Funcionario funcionario : funcionarios){
                dado.writeObject(funcionario);
            }
            dado.writeObject(f);
            dado.close();
            file.close();
        }catch(IOException e){
            System.out.println("Não foi possível abrir o arquivo");
        }
    }
    public static void main(String[] args) {
        AcessaArquivo.setFuncionario(new Funcionario(123456789, "João", 123789, 789123));
        AcessaArquivo.setFuncionario(new Funcionario(987654321, "Maria", 789456, 456789));
        AcessaArquivo.setFuncionario(new Funcionario(123789456, "Joaquim", 456123, 123456));
        AcessaArquivo.getFuncionario();
        AcessaArquivo.getFuncionario(123456789);
    }
}
