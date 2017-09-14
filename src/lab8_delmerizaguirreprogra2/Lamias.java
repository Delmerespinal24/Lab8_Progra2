/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_delmerizaguirreprogra2;

import javax.swing.JOptionPane;

/**
 *
 * @author Delmer
 */
public class Lamias extends Hada {
     private double logitud_aleta, numero_branquias;

    public Lamias(int logitud_aleta, int numero_branquias, String Nombre, double Altura, int Edad, int salud, int poder) {
        super(Nombre, Altura, Edad, salud, poder);
        this.logitud_aleta = logitud_aleta;
        this.numero_branquias = numero_branquias;
    }

    public double getLogitud_aleta() {
        return logitud_aleta;
    }

    public void setLogitud_aleta(int logitud_aleta) {
        if (logitud_aleta <= 5) {
            this.logitud_aleta = logitud_aleta;
        } else {
            JOptionPane.showMessageDialog(null, "La longitud de la aleta debe ser menor o igual a 5");
            this.logitud_aleta = 5;
        }
    }

    public double getNumero_branquias() {
        return numero_branquias;
    }

    public void setNumero_branquias(int numero_branquias) {
        if (numero_branquias <= 8) {
            this.numero_branquias = numero_branquias;
        } else {
            JOptionPane.showMessageDialog(null, "El numero de branquias debe ser menor o igual a 8");
        }
    }

  
}
