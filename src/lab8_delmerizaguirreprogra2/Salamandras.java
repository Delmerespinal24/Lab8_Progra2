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
public class Salamandras extends Hada{
     private int cant_alas;

    public Salamandras(int cant_alas, String Nombre, double Altura, int Edad, int salud, int poder) {
        super(Nombre, Altura, Edad, salud, poder);
        this.cant_alas = cant_alas;
    }

    public int getCant_alas() {
        return cant_alas;
    }

    public void setCant_alas(int cant_alas) {
        if (cant_alas >= 16) {
            this.cant_alas = cant_alas;
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad de alas debe ser mayor o igual a 16");
        }
    }

    
}
