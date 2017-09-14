
package lab8_delmerizaguirreprogra2;

import java.util.ArrayList;
import java.io.*;

public class AdminBinarios {

    private ArrayList<Hada> ListaHadas = new ArrayList();
    private File archivo = null;

    public AdminBinarios() {
    }

    public ArrayList<Hada> getListaHadas() {
        return ListaHadas;
    }

    public void setListaHadas(ArrayList<Hada> ListaUsuarios) {
        this.ListaHadas = ListaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //Extra mutador
    public void addHada(Hada u) {
        this.ListaHadas.add(u);

    }

    public void CargarArchivo() {
        try {
            ListaHadas = new ArrayList();
            Hada temp;
           
            if (archivo.exists()) {
                FileInputStream entrada = null;
                ObjectInputStream objeto = null;
                
                try {
                    entrada
                            = new FileInputStream(archivo);
                    objeto
                            = new ObjectInputStream(entrada);
                    
                    while ((temp = (Hada) objeto.readObject()) != null) {
                        ListaHadas.add(temp);
                        
                    }
                } catch (EOFException e) {
                    //Encontro el final del archivo
                }
                
                objeto.close();
                entrada.close();

            }
        } catch (Exception e) {
            
        }

    }
   

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Hada h : ListaHadas) {
                bw.writeObject(h);

            }
            bw.flush();
        } catch (IOException e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
            }
        }

    }

}
