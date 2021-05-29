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
public class veleros extends embarcacion {

    private float eslora;
    float costeDia;

    public veleros() {
    }

    public veleros(float eslora, float costeDia) {
        this.eslora = eslora;
        this.costeDia = costeDia;
    }

    public veleros(float eslora, float costeDia, String matricula, int dias, puertodeportivo.patron patron) {
        super(matricula, dias, patron);
        this.eslora = eslora;
        this.costeDia = costeDia;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
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
        System.out.println("eslora" + eslora + "costeDia" + costeDia);
    }

}
