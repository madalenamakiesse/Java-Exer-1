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
public class Fabrica {
    private int numEmp;
    private Empregado[] empregado;

    public Fabrica(int numEmp, Empregado[] empregado) {
        this.numEmp = numEmp;
        this.empregado = empregado;
    }
    
   

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }
    public void fabricar(){
        for(int i=0; i<numEmp; i++){
            empregado[i].trabalha();
        }
    }
}
