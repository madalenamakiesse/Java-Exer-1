/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

/**
 *
 * @author Madalena Makiesse
 */
public class Empregado {
    private String nome;
    private Data ano_de_nascimento;

    public Empregado(String nome, Data ano_de_nascimento) {
        this.nome = nome;
        this.ano_de_nascimento = ano_de_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getAno_de_nascimento() {
        return ano_de_nascimento;
    }

    public void setAno_de_nascimento(Data ano_de_nascimento) {
        this.ano_de_nascimento = ano_de_nascimento;
    }
     public void trabalha(){
         
     }
    
}
