/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author vi
 */
public class Camper extends MotorHome{
    int tamDepAl;
    int tamDepAG;

    public Camper(int tamDepAl, int tamDepAG, int id, String Marca, String Modelo, int Longitud, char tipo) {
        super(id, Marca, Modelo, Longitud, tipo);
        this.tamDepAl = tamDepAl;
        this.tamDepAG = tamDepAG;
    }

    public Camper(int tamDepAl, int tamDepAG) {
        this.tamDepAl = tamDepAl;
        this.tamDepAG = tamDepAG;
    }

    @Override
    public String toString() {
        return "Camper{" + "tamDepAl=" + tamDepAl + ", tamDepAG=" + tamDepAG + '}';
    }
    
    
    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
