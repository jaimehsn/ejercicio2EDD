/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitandgithub;

/**
 *
 * @author jaime
 */
public class patata {
    private int numeroPatata;

    public patata(int numeroPatata) {
        this.numeroPatata = numeroPatata;
    }

    public int getNumeroPatata() {
        return numeroPatata;
    }

    public void setNumeroPatata(int numeroPatata) {
        this.numeroPatata = numeroPatata;
        System.out.println("Cambio numero 2");
        System.out.println("Cambio numero 4");
    }
    
}
