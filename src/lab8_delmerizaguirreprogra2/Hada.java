
package lab8_delmerizaguirreprogra2;

import java.io.Serializable;

/**
 *
 * @author Delmer
 */
public class Hada implements Serializable {
    private String Nombre;
    private double Altura;
    private int Edad;
    private int salud;
    private int poder;

    public Hada(String Nombre, double Altura, int Edad, int salud, int poder) {
        this.Nombre = Nombre;
        this.Altura = Altura;
        this.Edad = Edad;
        this.salud = salud;
        this.poder = poder;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
    
    
}
