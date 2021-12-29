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
public class Autocaravana extends MotorHome {
    
    TIPO_AUTOCARAVANA tipoAc;

    public Autocaravana(TIPO_AUTOCARAVANA tipoAc, int id, String Marca, String Modelo, int Longitud, char tipo) {
        super(id, Marca, Modelo, Longitud, tipo);
        this.tipoAc = tipoAc;
    }

    public Autocaravana(TIPO_AUTOCARAVANA tipoAc) {
        this.tipoAc = tipoAc;
    }

    @Override
    public String toString() {
        return "Autocaravana{" + "tipoAc=" + tipoAc + '}';
    }
    
    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
