/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesd;

import Ex3.Data;
import Ex3.Empregado;
import Ex3.Fabrica;
import Ex3.Gestor;
import Ex3.Operario;
import java.util.Scanner;

/**
 *
 * @author Madalena Makiesse
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Número de empregados: ");
        Scanner ler  = new Scanner(System.in);
        int nE = ler.nextInt();
        //Fabrica fabrica = new Fabrica(nE);
        Empregado[] emp = new Empregado[nE];
        for(int i=0; i<nE; i++){
            System.out.println("Nome: ");
            String nome = ler.nextLine();
            System.out.println("Data: dd/mm/aa");
            int d = ler.nextInt();
            int m = ler.nextInt();
            int a = ler.nextInt();
            Data data = new Data(a,d,m);
            System.out.println("Tipo de empregado: \n1-Gestor\n2-Operário");
            int t = ler.nextInt();
            if(t==1){
                emp[i]= new Gestor(nome,data);
            }
            else{
                emp[i]= new Operario(nome,data);
            }
        }
        Fabrica fabrica = new Fabrica(nE,emp);
    }
    
}
