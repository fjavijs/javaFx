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
public abstract class MotorHome implements Imprimible {

    int id;
    String Marca;
    String Modelo;
    int Longitud;
    char tipo;

    public MotorHome(int id, String Marca, String Modelo, int Longitud, char tipo) {
        this.id = id;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Longitud = Longitud;
        this.tipo = tipo;
    }

    public MotorHome() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "MotorHome{" + "id=" + id + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Longitud=" + Longitud + ", tipo=" + tipo + '}';
    }

}
