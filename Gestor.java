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
public class Gestor extends Empregado{

    public Gestor(String nome, Data ano_de_nascimento) {
        super(nome, ano_de_nascimento);
    }

    @Override
    public void trabalha() {
        System.out.println("Gestor "+super.getNome()+" a gerir.");
    }
    
}
