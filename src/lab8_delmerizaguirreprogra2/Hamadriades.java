
package lab8_delmerizaguirreprogra2;

/**
 *
 * @author Delmer
 */
public class Hamadriades extends Hada{
    
    private int arbol;

    public Hamadriades(int arbol, String Nombre, double Altura, int Edad, int salud, int poder) {
        super(Nombre, Altura, Edad, salud, poder);
        this.arbol = arbol;
    }

    public int getArbol() {
        return arbol;
    }

    public void setArbol(int arbol) {
        this.arbol = arbol;
    }

}
