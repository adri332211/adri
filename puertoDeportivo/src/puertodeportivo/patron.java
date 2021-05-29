/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puertodeportivo;

/**
 *
 * @author USUARIO
 */
public class patron {

    private String dni;
    private String numCarnet;

    public patron() {
    }

    public patron(String dni, String numCarnet) {
        this.dni = dni;
        this.numCarnet = numCarnet;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumCarnet() {
        return numCarnet;
    }

    public void setNumCarnet(String numCarnet) {
        this.numCarnet = numCarnet;
    }

    public void mostrar() {
        System.out.println("dni" + dni + "numCarnet" + numCarnet);
    }
}
