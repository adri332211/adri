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
public class embarcacion {

    private String matricula;
    private int dias;
    patron patron;

    public embarcacion() {
    }

    public embarcacion(String matricula, int dias, patron patron) {
        this.matricula = matricula;
        this.dias = dias;
        this.patron = patron;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public patron getPatron() {
        return patron;
    }

    public void setPatron(patron patron) {
        this.patron = patron;
    }

    public void mostrar() {
        System.out.println("matricula" + matricula + "dias" + dias + "patron" + patron);
    }
}
