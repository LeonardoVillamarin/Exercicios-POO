package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio7;

import java.io.Serializable;

public class Funcionario implements Serializable{
    int numRegistro;
    String nome;
    int numDep;
    int numDepGerenciado;

    public Funcionario(int numRegistro, String nome, int numDep, int numDepGerenciado){
        this.numRegistro = numRegistro;
        this.nome = nome;
        this.numDep = numDep;
        this.numDepGerenciado = numDepGerenciado;
    }
}
