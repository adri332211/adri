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
public class yates extends embarcacion {

    int potencia;
    float costeDia;

    public yates() {
    }

    public yates(int potencia, float costeDia) {
        this.potencia = potencia;
        this.costeDia = costeDia;
    }

    public yates(int potencia, float costeDia, String matricula, int dias, puertodeportivo.patron patron) {
        super(matricula, dias, patron);
        this.potencia = potencia;
        this.costeDia = costeDia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public float getCosteDia() {
        return costeDia;
    }

    public void setCosteDia(float costeDia) {
        this.costeDia = costeDia;
    }

    @Override
    public puertodeportivo.patron getPatron() {
        return patron;
    }

    @Override
    public void setPatron(puertodeportivo.patron patron) {
        this.patron = patron;
    }

    @Override
    public void mostrar() {
        System.out.println("potencia" + potencia + "costeDia" + costeDia);
    }

}
