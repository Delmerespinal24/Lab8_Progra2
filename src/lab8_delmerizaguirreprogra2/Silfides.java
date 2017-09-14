package lab8_delmerizaguirreprogra2;

import javax.swing.JOptionPane;

public class Silfides extends Hada{

    private int cant_alas;

    public Silfides(int cant_alas, String Nombre, double Altura, int Edad, int salud, int poder) {
        super(Nombre, Altura, Edad, salud, poder);
        this.cant_alas = cant_alas;
    }

     
    public int getCant_alas() {
        return cant_alas;
    }

    public void setCant_alas(int cant_alas) {
        if (cant_alas >= 6) {
            this.cant_alas = cant_alas;
        } else {
            JOptionPane.showMessageDialog(null, "El numero de alas debe ser mayor o igual a 6");
            this.cant_alas = 6;
        }
    }

}
